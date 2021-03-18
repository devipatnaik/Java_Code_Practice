package com.javadev.Exception;

public class ClassCastExceptionTest {

	public static void main(String[] args) {
		
		String str = new String("Devi");
		Object obj = (Object)str;
		System.out.println(obj);
		
		Object obj1 = new Object();
		String str1 = (String)obj1;  // CCE
		System.out.println(obj1);

	}

}
