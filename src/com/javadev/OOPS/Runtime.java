package com.javadev.OOPS;

class Parent1{
	
	public void m1() {
		System.out.println("m1() from Parent");
	}
	

}

class Child1 extends Parent1 {
	
	
	public void m1() {
		System.out.println("m1() from Child");
	}
	
	public void m2() {
		System.out.println("m2() from Child");
	}
}

public class Runtime {
	
	public static void main(String[] args) {
		
		Parent1 p = new Child1();
		p.m1();
		((Child1)p).m2();
		
		
	}

}