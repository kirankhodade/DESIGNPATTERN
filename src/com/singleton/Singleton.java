package com.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private static volatile Singleton singletonInstance = null;
	
	private Singleton() {
		//Protecting from being created using reflection
		  if(singletonInstance != null) { throw new
		  RuntimeException("Use getSingletonInstance() method to create"); }
		 
		 
	}
	
	public static Singleton getSingletonInstance() {	
		//Lazy Loading & Thread safety(using volatile & double-check locking)
		/*
		 * if(singletonInstance == null) { synchronized (Singleton.class) {
		 * if(singletonInstance == null) { singletonInstance = new Singleton(); }
		 * 
		 * } }
		 * 
		 * return singletonInstance;
		 */
		
		//Using Static holder pattern class : It works on lazy principle and provides thread safety.
		return Holder.INSTANCE;
	}
	
	private Object readResolve() throws ObjectStreamException{
		System.out.println("inside read resolve method");
		return singletonInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	static class Holder{
		static final Singleton INSTANCE = new Singleton();
	}
}
