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

public class SingletonDemo {

	public static void main(String[] args) throws Exception {

		// Reflection violation of singleton(It can be resolved using ENUM or by
		// applying check in constructor.)
		Class mySingleton = Class.forName("com.singleton.Singleton");
		Constructor<Singleton> constr = mySingleton.getDeclaredConstructor();
		constr.setAccessible(true);
		Singleton instance3 = constr.newInstance();
		print(instance3);

		Singleton instance1 = Singleton.getSingletonInstance();
		Singleton instance2 = Singleton.getSingletonInstance();
		print(instance1, instance2);

		// Serialization violation of singleton(It can be resolved using readResolve()
		// Method)
		/*
		 * ObjectOutputStream os = new ObjectOutputStream(new
		 * FileOutputStream("index.txt")); os.writeObject(instance1); os.close();
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(new
		 * FileInputStream("index.txt")); Singleton instance4 =
		 * (Singleton)ois.readObject(); ois.close();
		 * 
		 * print(instance4);
		 */

		// Clone violation of singleton(It can be resolved by implementing clone Method
		// and throwing Clone not supported exception)
		/*
		 * Singleton instance5 = (Singleton)instance1.clone(); print(instance5);
		 */

		// Thread safety violation of singleton(Thread safety can be resolved by (using
		// volatile & double-check locking in class) or ENUM implementation or using
		// static holder pattern)

		/*
		 * ExecutorService service = Executors.newFixedThreadPool(100); for(int
		 * i=0;i<500;i++) { service.submit(TestClass::useSingleton); }
		 * 
		 * service.shutdown();
		 */

	}

	private static void print(Singleton... instance) {
		for (int i = 0; i < instance.length; i++) {
			System.out.println("HashCode : " + instance[i]);
		}
	}
}

/*
 * class TestClass{ static void useSingleton() {
 * 
 * Singleton singleton = Singleton.getSingletonInstance();
 * System.out.println("Singleton singleton : "+singleton);
 * 
 * 
 * 
 * SingletonEnum se = SingletonEnum.INSTANCE;
 * System.out.println("SingletonEnum se : "+se.hashCode());
 * 
 * 
 * } }
 */

//using ENUM to implement singleton provides protection for thread-safety, cloning, Serialization-deSerialization  and Reflection.
/*
 * enum SingletonEnum { INSTANCE;
 * 
 * public String getConfiguration() { return "bacd"; } }
 */
