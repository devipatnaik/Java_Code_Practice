package com.javadev.oopstest;

class A1
{
    void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 A");
    }
}
class B1 extends A1
{
    void m1() throws RuntimeException
    {
        System.out.println("In m1 B");
    }
}

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		A1 a1 = new B1();
		a1.m1();
	}
}
