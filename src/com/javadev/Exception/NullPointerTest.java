package com.javadev.Exception;

public class NullPointerTest {

	public static void main(String[] args) {
		
		// NullPointerException
		//Dog dog = null;
		//System.out.println(dog.dogName);
		
		Dog dog = null;
		try {
			System.out.println(dog.dogName);
		} catch (NullPointerException e) {
			dog = new Dog();
			System.out.println(dog.dogName);
			//e.printStackTrace();
		}
	}
}
