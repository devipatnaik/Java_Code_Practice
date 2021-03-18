package com.javadev.fundamental;

public class SecondLargestNumberFromArray {

	public static void main(String[] args) {
		
		int[] arr = {2,5,7,10,76,5,76};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] != largest){
				secondLargest = arr[i];
			}
			
		}
		System.out.println("Second Largest Number in Array : "+secondLargest);
		
		
	}

}
