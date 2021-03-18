package com.javadev.Boolean;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		int start = 0;
		int end = arr.length - 1;
		int temp = 0;
		int middle = arr.length/2;
		
		for(; start < middle; start++, end--) {
			
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		
		System.out.println("Reversed Array : "+Arrays.toString(arr));
		
	}
}
