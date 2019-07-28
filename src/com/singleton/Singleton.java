package com.singleton;

public class Singleton {
	private static Singleton singletonInstance = null;

	private Singleton() {}
	
	public static Singleton getSingletonInstance() {	
		//Lazy Loading
		if(singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
}
