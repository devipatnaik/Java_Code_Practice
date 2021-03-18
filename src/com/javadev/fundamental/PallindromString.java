package com.javadev.fundamental;

public class PallindromString {

	public static void main(String[] args) {
		
		String original = "123";
		String reverse="";
		
		int len = original.length();
		
		for(int i = len-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Pallindrome String");
		}else {
			System.out.println("Not Pallindrome String");
		}
		
	}

}
