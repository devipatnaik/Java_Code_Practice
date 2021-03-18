package com.javadev.java8;

interface inf{
	
	public static void m1() {
		System.out.println("static");
	}
	
	public void m2();
	
	default void m3() {
		System.out.println("default");
	}
	
}

public class Test implements inf{
	@Override
	public void m2() {
		System.out.println("abstract");
		
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m3();
		t.m2();
		//calling the static method of interface
		inf.m1();
	}
}
