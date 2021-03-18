package com.javadev.fundamental;

public class SortIntegerArray {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,7,5,8};
		
		int temp = 0;
		int n= 6;
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");	
		}
	}
}
