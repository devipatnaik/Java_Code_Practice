package com.javadev.Exception;

import java.util.Scanner;

public class ExceptionHirarchie {
	
	public static void main(String[] arr) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter String");
		//String str = scan.nextLine();
		//System.out.println("Enter Number");
		//Integer no = scan.nextInt();
		
		try {
			
			//str = null;
			//System.out.println(str.length());
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int res = a/b;
			System.out.println("Result Is : "+res);
		
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Enter num:");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2 no. required ");
		}
		catch (NumberFormatException e) {
			System.out.println("Enter no only");
		}
	}
}
