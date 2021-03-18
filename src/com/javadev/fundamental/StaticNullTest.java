package com.javadev.fundamental;

public class StaticNullTest {

	public static void main(String[] args) {
		Test t = null;
		t.staticMethod();
	}

}

class Test{
	public static void staticMethod() {
		System.out.println("Static Method");
	}
}
