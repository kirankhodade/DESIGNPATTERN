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
 
 * What is Singleton?
	Singleton is a Creational Design Pattern and ensures that:
		- Only one instance of a class exists.
		- Provides a global access point to it.

	When to Use Singleton?
		- Shared resources: Logger, Configuration, Cache, Thread pools
		- When exactly one object is required across application.
		- Singleton approach can also be used to create variable fixed number of instances.
				
   How can we break Singleton instance?
   Cloning : Resolved by Either not implementing Cloneable interface OR if we do implement Cloneable interface then overriding clone method and Either throwing CloneNotSupportedException or returning the same SingletonInstance from clone method, as per our wish.
   Reflection : Can be resolved by lazily loading and applying check in constructor.
   Serialization/De-serialization : Resolved by overriding readResolve() Method and return singletonInstance.
   multi-threaded access : 
   	1. If we eagerly initialize(i.e objects are created at the time of class loading, then multi-threaded access problem does not arise.)
   	2. If we are lazily loading then by using volatile keyword and double-check locking mechanism,  multi-threaded access can be resolved.
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
   	PROS : Simple and Thread-safe(class loading guarantees it)
    Cons:  Instance created even if not used
   	Example : 
		public class Singleton { 
			private static final Singleton INSTANCE = new Singleton(); 
			private Singleton() {} 
			public static Singleton getInstance() { return INSTANCE; } 
		}
   	
   Static holder pattern(i.e. Bill Pugh Singleton).
   		Pros: It achieves lazy loading without the performance overhead of synchronized blocks or the complexity of volatile.
			  Thread-Safe : 
			  	- The thread safety is guaranteed by the JVM through the Class Loading Process.
				- The Class Initialization Guarantee : According to the Java Language Specification, the initialization of a class is guaranteed to be atomic and thread-safe.
				- The inner class SingletonHelper is not loaded when the outer class BillPughSingleton is loaded. 
				- It is only loaded when the getInstance() method is called for the first time. 
				- This is because:
						-> A SingletonHelper class is loaded only when it is actually referenced in getInstance() method.
						-> SingletonHelper.INSTANCE in getInstance() method, is the first and only reference to the inner class.
						-> And this loading is Thread-safe because of The Class Initialization Guarantee.
		Example : 
			public class BillPughSingleton {
			    private BillPughSingleton() {}
			
			    // The "Holder" class
			    private static class SingletonHelper {
			        // Static final instance
			        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
			    }
			
			    public static BillPughSingleton getInstance() {
			        return SingletonHelper.INSTANCE;
			    }
			}
			  
   
   Using Enum : 
   		Example : 
	   		enum DatabaseConnection {
			    INSTANCE;
			
			    public void connect() {
			        // Logic here
			    }
			}
	Pros: Thread-safe by default
	Prevents: Reflection attack, Serialization issues, Simple & robust
👉 Recommended by Effective Java (Joshua Bloch)
   		
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
