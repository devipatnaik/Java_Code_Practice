package com.javadev.passbyvalaueAndreference;

public class PassByReference {

	int data = 50;
	
	public void change(PassByReference passbyref) {
		data = data + 300; // change in the instance variable only 
	}

	public static void main(String[] args) {
		PassByReference ref = new PassByReference();
		
		System.out.println("Before Change : "+ref.data);
		ref.change(ref); // passing object
		System.out.println("After Change : "+ref.data);
	}
}
