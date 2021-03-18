package com.javadev.java8;


public interface FunctionalInterfaceDemo {
	
	public void m1();
	public void m2();
	
	default void m3() {
		
	}
	
	static void m4() {
		
	}

}
/*@FunctionalInterface
interface Runnable {  // Invalid '@FunctionalInterface' annotation; Runnable is a functional interface
	public void run();
	
	public void m7();
}*/
