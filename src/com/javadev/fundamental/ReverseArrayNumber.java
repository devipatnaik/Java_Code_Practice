package com.javadev.fundamental;

import java.util.Arrays;

public class ReverseArrayNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int start=0;
		int end = arr.length-1;
		int middle = arr.length/2;
		int temp=0;
		
		for (; start<middle; start++, end--) {
			
			
			temp=arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		
		System.out.println("Reverse: "+Arrays.toString(arr));
		
	}

}
