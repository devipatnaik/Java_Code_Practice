package com.javadev.fundamental;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String original;
		String reverse="";
		System.out.println("Enter String");
		
		Scanner scan = new Scanner(System.in);
		original = scan.nextLine();
		
		int len = original.length();
		System.out.println(len);
		
		for(int i=len-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Reverse String : "+reverse);
	}
}
