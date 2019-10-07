package com.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * Design Patterns : 
 * Types : 
 * 1. Creational
 * 2. Structural
 * 3. Behavioural
 * 1. Creational : deals with creation of object.
 * 	Types of creational : Singleton, Builder, Prototype, Factory, Abstract Factory.
 * 
 * Singleton class has only one instance and provides a global point of well-known access to it.
 * Singleton is Lazily loaded and thread-safe.
 * Flexibility(The Singleton class may be sub-classed, and it’s easy to configure an application with an instance of this extended class. 
 *             You can configure the application with an instance of the class you need at run-time.)
 * Provides controlled access.(i.e Singleton class encapsulates its instance, it can have strict control over how and when clients access it.)
 * Permits a variable number of instances.( i.e Singleton makes it easy to change your mind and allow more than one instance of the Singleton class. 
 *                                              Moreover, you can use the same approach to control the number of instances that the application uses. 
 *                                              Only the operation that grants access to the Singleton instance needs to change.
 *                                        )
 * Reduce name-space(i.e instead of having lots of global variables(eg: different configurations in applications)
					  one singleton can be created of all the configurations and passed on.)
   Example : Runtime environment, GUI pop-up, Logger, Spring beans, Configuration file, Cache.
					  
   How can we break Singleton instance?
   Cloning : Resolved by Either not implementing Cloneable interface OR if we do implement Cloneable interface then overriding clone method and Either throwing CloneNotSupportedException or returning the same SingletonInstance from clone method, as per our wish.
   Reflection : Can be resolved by lazily loading and applying check in constructor.
   Serialization/De-serialization : Resolved by overriding readResolve() Method and return singletonInstance.
   multi-threaded access : 
   							1. 	If we eagerly initialize(i.e objects are created at the time of class loading, then multi-threaded access problem does not arise.)
   							2.  If we are lazily loading then by using volatile keyword and double-check locking mechanism,  multi-threaded access can be resolved.
   Multiple class loaders --> In application servers multiple class loaders can create duplicate instances.
    						  As certain class loaders may not bother looking at parent class loader context to see if instance is already initialized.
   							  This problem is hard to fix. On Internet we do find some code fixes we can apply on our classes.
   							  
   							  
   Why not use class with static methods and variables instead of singleton?
		   Well use it, But Singleton has its usage scenarios. 
		   Also there special mention by gang of 4 that 
		   	"Singleton instance being extensible by sub-classing and clients should be able to use an extended instance without modifying there code"  	
		   Static makes it hard to change a design to allow more than one instance of a class. Moreover, static cannot be sub-classed and we can’t override them polymorphically.


   
   What are different ways to create singleton instance?
   Lazily loading : Normal GetInstance method(using volatile and double check locking).
   Eagerly loading : Singleton with public static final field initialized during class loading.
   Static holder pattern.
   Using Enum
   
   
   Volatile : Change to volatile variable will be published, only when change is complete on that object.
   			  i.e half baked objects will not be seen by other objects, once change in object is complete then it will be published for other objects to consume. 
   			  i.e In java write to a volatile variable happens before read.
   			  
   	
   TOP INTERVIEW QUESTIONS ON SINGLETON : https://javarevisited.blogspot.com/2011/03/10-interview-questions-on-singleton.html 
 * */

public class Singleton implements Serializable, Cloneable{
	
	private static final long serialVersionUID = -251791383343504407L;
	private static volatile Singleton singletonInstance = null;
	
	
	//Boolean variable enforces that singleton instance is created
	//only using getInstance method and no other way(eg: Reflection)
	private static boolean validCall = false;
	
	private Singleton() {
		//Protecting from being created using reflection
		System.out.println("Inside constructor");
		  if(singletonInstance != null || !validCall) { 
			  throw new RuntimeException("Use getSingletonInstance() method to create");
		  }
	}
	
	public static Singleton getSingletonInstance() {	
		//Lazy Loading & Thread safety(using volatile & double-check locking)
		 if(singletonInstance == null) { 
			 synchronized (Singleton.class) {
				  if(singletonInstance == null) { 
					  validCall = true;
					  singletonInstance = new Singleton(); 
					  validCall = false;
				   } 
		      }
	      }
		  
		  return singletonInstance;
		 
		//Using Static holder pattern class : It works on lazy principle and provides thread safety, 
		                                  //  but serialization/deserialization pitfall test fails so cannot use it.
		/* return Holder.INSTANCE; */ 
	}
	
	private Object readResolve() throws ObjectStreamException{
	  System.out.println("inside read resolve method"); 
	  return singletonInstance; 
	}
	 

	
	  @Override 
	  protected Object clone() throws CloneNotSupportedException { 
		  throw new CloneNotSupportedException(); 
	  }
	 
	
	static class Holder implements Serializable{
		static final Singleton INSTANCE = new Singleton();
	}
}
