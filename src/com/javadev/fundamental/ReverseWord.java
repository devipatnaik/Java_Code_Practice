package com.javadev.fundamental;

// input = java code
// output = avaj edoc

public class ReverseWord {
	
	public static void main(String[] args) {
		
		
		String input = "Java Code";
		System.out.println("Original String : "+input);
		String output="";
		
		String[] words = input.split(" ");
		
		for(String word : words) {
			//System.out.println(word);
			
			String reverse="";
			
			for(int i=word.length()-1; i>=0; i--) {
				reverse = reverse + word.charAt(i);
			}
			
			output = output + reverse + " ";
		}
		System.out.println("Reversed String : "+output);
		
	}

}
