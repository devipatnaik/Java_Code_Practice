package com.javadev.String;

public class StringBufferAndBuilderTest {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb1 = new StringBuffer("Hello");
		
		for(int i=0; i<100000; i++) {
			sb1.append("Java");
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Hello");
		
		for(int i=0; i< 100000; i++) {
			sb2.append("Java");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
