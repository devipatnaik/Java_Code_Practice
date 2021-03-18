package com.javadev.fundamental;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=n;j++) {
				
				System.out.print(print(i, j)+" ");
			}
			System.out.println();
		}
	}

	public static int print(int n, int k) {

		int res = 1;
		
		if(k > n-k) {
			k = n-k;
		}
		
		for(int i=0;i<k;++i) {
			
			res *= (n - i);
			res /= (i + 1);
			
		}
		return res;
	}
}
