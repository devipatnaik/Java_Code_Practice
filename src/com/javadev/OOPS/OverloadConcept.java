package com.javadev.OOPS;

/**
 * 
 * @author devpatna
 * 
 * overload concept : it happens 
 * with in the class
 * same method name
 * Different Arguments
 * 		No. of Arguments
 * 		Sequence of Arguments
 * 		Type of Arguments
 * 
 * Case:1 if Return Type of method is different then method arguments should be different or else you will get C.E
 * Case:2 we can overload the varargs.
 * Case:3 Automatic Promotion
 * Case:4 we can overload static methods.
 * Case:5 While resolving overloaded methods, 
 * 		  compiler will always give precedence to Child type arguments then compare with parent type argument.
 * Case:6 If overload in same class like String and String Buffer then it will call to String class only.
 *  if you pass null in the method then you will get C.E : The method show(StringBuffer) is ambiguous for the type OverloadConcept
 */

public class OverloadConcept {
	
	/*public void show(int a) {
		System.out.println("one int method parameter");
	}
	
	public void show() {
		System.out.println("no arg method");
	}*/
	
	// No. of Arguments
	/*public void show(int a, int b) {
		System.out.println("two int method parameter");
	}
	
	public void show() {
		System.out.println("no arg method");
	}*/
	
	// Sequence of Arguments
	/*public void show(int a, String b) {
		System.out.println("two int and String method parameter");
	}
	
	public void show(String a, int b) {
		System.out.println("two String and int method parameter");
	}*/
	
	// type of arguments
	/*public void show(int a) {
		System.out.println("int type argument");
	}
	
	public void show(String a) {
		System.out.println("String type argument");
	}*/
	
	// case-1 : return type of method is different and method signature is same then C.E
	/*public void show(int a) {
		System.out.println("return void");
	}
	
	public String show(int a) {
		System.out.println("return String");
		return "hi";
	}*/
	
	/*public void show(int a) {
		System.out.println("return void");
	}
	
	public String show(String a) {
		System.out.println("return String");
		return "hi";
	}*/
	
	// varargs overload
	/*public void show(int a) {
		System.out.println("one arg");
	}
	
	public void show(int...a) {
		System.out.println("varargs");
	}*/
	
	// auto promotion
	/*public void show(int a,float b) {
		System.out.println("one arg");
	}
	
	public void show(String a,float b) {
		System.out.println("string and float signature");
	}*/
	
	// overload static methods
	/*public static void show(int a,float b) {
		System.out.println("one arg static");
	}
	
	public static void show(String a,float b) {
		System.out.println("static string and float signature");
	}*/
	
	// Parent child class == Object and String
	/*public void show(Object a) {
		System.out.println("Object parent type");
	}
	
	public void show(String a) {
		System.out.println("string child type");
	}*/
	
	
	public void show(StringBuffer a) {
		System.out.println("String method");
	}
	
	public void show(String a) {
		System.out.println("String Buffer method");
	}
	
	public static void main(String[] args) {
		
		OverloadConcept obj = new OverloadConcept();
		//obj.show(10,"devi");
		//obj.show(10,20,30,40);
		//obj.show("devi",10.0f);
		//obj.show("devi");
		obj.show(new StringBuffer("devi"));
		//obj.show(null);
		
	}
}
