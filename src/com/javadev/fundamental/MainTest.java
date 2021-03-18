package com.javadev.fundamental;

public class MainTest {
	
	protected static void main(String[] args) {
		System.out.println("hello from MainTest");
	}

}
class PublicMain {
    public static void main( String [] args ) {
    	MainTest.main( args );
    	System.out.println("public");
    }
}