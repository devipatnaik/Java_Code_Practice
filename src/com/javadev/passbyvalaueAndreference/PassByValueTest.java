package com.javadev.passbyvalaueAndreference;

public class PassByValueTest {

	int data = 50;

	public void change(int data) {
		data = data + 100; // change in the local variable only
	}

	public static void main(String[] args) {
		PassByValueTest value = new PassByValueTest();

		System.out.println("Before Change : " + value.data);
		value.change(200);
		System.out.println("After Change : " + value.data);
	}
}
