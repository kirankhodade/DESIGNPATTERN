package com.main;

import com.singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getSingletonInstance();
		Singleton instance2 = Singleton.getSingletonInstance();
		
		System.out.println("Singleton instance1 : "+instance1);
		System.out.println("Singleton instance2 : "+instance2);
	}

}
