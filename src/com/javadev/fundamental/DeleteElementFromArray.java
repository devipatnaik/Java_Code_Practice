package com.javadev.fundamental;

public class DeleteElementFromArray {

	public static void main(String[] args) {

		int[] arr = { 10, 40, 30, 60, 90 };
		
		int delete = 90;
		
		int count =0;
		
		int arrLen = arr.length;
		
		for(int i=0;i<arrLen;i++) {
			if(delete == arr[i]) {
				for(int j =i; j<arrLen-1; j++) {
					arr[j] = arr[j+1];
				}
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("elememt not found : "+ delete);
		}else {
			System.out.println("Element deleted successfully!");
			for(int i=0; i < arrLen-1; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
