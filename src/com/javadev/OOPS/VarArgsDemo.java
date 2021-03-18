package com.javadev.OOPS;

public class VarArgsDemo {
	
	
	public static void display(int ...a) {
		System.out.println("Number of arguments: " + a.length); 
		for( int i :a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void display(int a, int b) {
		int sum = a + b;
		System.out.println("Number of arguments: "+sum); 
	}
	
	public static void main(String[] args) {
		display(10);
		display(10,20);
	}

}
