package com.javadev.Boolean;

public class BooleanTest {
	
	public static void main(String[] args) {
		
		Boolean b1 = new Boolean("True");
		Boolean b2 = new Boolean("tRue");
		Boolean b3 = new Boolean("true");
		Boolean b4 = new Boolean("TRUE");
		
		System.out.println(b1.equals(b2));  
		System.out.println(b3.equals(b4));  
	}

}
