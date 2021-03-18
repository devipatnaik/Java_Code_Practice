package com.javadev.oopstest;

import java.io.IOException;

class A2
{
    void m1() throws Exception
    {
        System.out.println("In m1 A");
    }
}
class B2 extends A2
{
    void m1() throws IOException
    {
        System.out.println("In m1 B");
    }
}

public class ExceptionScope {

	public static void main(String[] args) throws Exception {
		
		A2 a2 = new B2();
		try {
			a2.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
