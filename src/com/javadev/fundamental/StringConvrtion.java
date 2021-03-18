package com.javadev.fundamental;

// a = 97 z = 122
// A = 65 Z = 90
// -------------
//     32     32

public class StringConvrtion {

	public static void main(String[] args) {
		
		String input ="CAT";
		
		for(int i=0; i<input.length(); i++) {
			
			int ch = input.charAt(i);
			
			if(ch>64 && ch<91) {
				ch = ch+32;
				System.out.print((char)ch);
			}
			else if(ch>96 && ch<123) {
				ch =ch-32;
				System.out.print((char)ch);
			}
			else if(ch == 32) {
				System.out.print((char)ch);
			}
		}
		
	}

}
