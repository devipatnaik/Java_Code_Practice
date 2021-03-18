package com.javadev.fundamental;

public class SecondSmallestNumberFromArray {

	public static void main(String[] args) {
		
		int[] arr = {2,5,7,8,19};
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int thirdSmallest = Integer.MAX_VALUE;
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] < smallest) {
				smallest = secondSmallest;
				secondSmallest = arr[i];
			}
			else if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
			else if(arr[i] < thirdSmallest && arr[i] != secondSmallest) {
				thirdSmallest = arr[i];
			}
			
		}
		System.out.println("Second Smallest is : "+ secondSmallest);
	}

}
