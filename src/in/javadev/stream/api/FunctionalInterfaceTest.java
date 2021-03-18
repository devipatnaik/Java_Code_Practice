package in.javadev.stream.api;

@FunctionalInterface
interface FunctionalInterfaceDemo {

	public void m1();

	// public void m2();

	static void m3() {
		System.out.println("hey! i am static method");
	}

	default void m4() {

	}

	default void m5() {

	}

}

public class FunctionalInterfaceTest{
	
	public static void main(String[] args) {
		
		FunctionalInterfaceDemo.m3();
	}
	
}
