package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.singleton.Singleton;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

public class SingletonDemo{

	public static void main(String[] args) throws Exception{
	  
		/*
		 * Singleton instance1 = Singleton.getSingletonInstance(); Singleton instance2 =
		 * Singleton.getSingletonInstance();
		 */
		
		/*
		 * System.out.println("Singleton instance1 : "+instance1);
		 * System.out.println("Singleton instance2 : "+instance2);
		 */
		 
		//Reflection violation of singleton(It can be resolved using ENUM)
		/*
		 * Class mySingleton = Class.forName("com.singleton.Singleton");
		 * Constructor<Singleton> constr = mySingleton.getDeclaredConstructor();
		 * constr.setAccessible(true); instance2 = constr.newInstance();
		 * System.out.println("Singleton instance2 : "+instance2);
		 */
		 
		//Serialization violation of singleton(It can be resolved using readResolve() Method)
		/*
		 * ObjectOutputStream os = new ObjectOutputStream(new
		 * FileOutputStream("index.txt")); os.writeObject(instance1); os.close();
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(new
		 * FileInputStream("index.txt")); Singleton instance2 =
		 * (Singleton)ois.readObject(); ois.close();
		 * 
		 * System.out.println("Singleton instance1 : "+instance1);
		 * System.out.println("Singleton instance2 : "+instance2);
		 */
		
		//Clone violation of singleton(It can be resolved by implementing clone Method and throwing Clone not supported exception)
		/*
		 * instance2 = (Singleton)instance1.clone();
		 * System.out.println("Singleton instance1 : "+instance1);
		 * System.out.println("Singleton instance2 : "+instance2);
		 */
		  
		//Thread safety violation of singleton(Thread safety can be resolved by (using volatile & double-check locking in class) or ENUM implementation or using static holder pattern)
		  ExecutorService service = Executors.newFixedThreadPool(2);
		  service.submit(TestClass::useSingleton);
		  service.submit(TestClass::useSingleton);
		  
		  service.shutdown();
	}
}

class TestClass{
	static void useSingleton() {
		
		  Singleton singleton = Singleton.getSingletonInstance();
		  System.out.println("Singleton singleton : "+singleton);
		 
		
		/*
		 * SingletonEnum se = SingletonEnum.INSTANCE;
		 * System.out.println("SingletonEnum se : "+se.hashCode());
		 */
		
	}
}

//using ENUM to implement singleton provides protection for thread-safety, cloning, Serialization-deSerialization  and Reflection.
enum SingletonEnum{
	INSTANCE;
	
	public String getConfiguration() {
		return "bacd";
	}
}
