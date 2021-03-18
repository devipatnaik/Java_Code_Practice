package com.javadev.fundamental;

public class MINNumberFromArray {

	public static void main(String[] args) {
		
		int[] num = {1,6,2,77,7,8,9};
		
		int min = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Min Number is : "+ min);
	}

}
