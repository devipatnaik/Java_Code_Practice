package com.javadev.Singleton;

public class App {

	public static void main(String[] args) {
		
		LazySingleton obj1 = LazySingleton.getInstance();
		
		System.out.println(obj1.hashCode());
		
		LazySingleton obj2 = LazySingleton.getInstance();
		
		System.out.println(obj2.hashCode());
		
		System.out.println("********************");
		
		EagerSingleton objEager1 = EagerSingleton.getInstance();
		
		System.out.println(objEager1.hashCode());
		
		EagerSingleton objEager2 = EagerSingleton.getInstance();
		
		System.out.println(objEager2.hashCode());
		
		System.out.println("********************");
		
		SingletonInnerClass objInner1 = SingletonInnerClass.getInstance();
		
		System.out.println(objInner1.hashCode());
		
		SingletonInnerClass objInner2 = SingletonInnerClass.getInstance();
		
		System.out.println(objInner2.hashCode());
		
	}

}
