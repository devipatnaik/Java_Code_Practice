package com.javadev.Design;

public class SingletonDemo {

	private static SingletonDemo singltonObj;

	private SingletonDemo() {
		System.out.println("Private Constructor....");
	}

	public static SingletonDemo getInstance() {

		if (singltonObj == null) {
			singltonObj = new SingletonDemo();
		}
		return singltonObj;

	}

	public void display() {

		System.out.println("display method...");
	}

	public static void main(String[] args) {

		SingletonDemo demo = SingletonDemo.getInstance();
		demo.display();

	}

}
