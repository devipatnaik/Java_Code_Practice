package com.javadev.Exception;

import java.io.IOException;

public class ExcDemo {
	
	
	public void m() throws IOException {
		System.out.println("Hello");
		//throw new IOException("Hello");
	}
	
	public void n() throws IOException  {
		m();
		//System.out.println("hiiii");
		throw new IOException("Hello world");
	}
	
	public void p() throws IOException  {
		n();
		System.out.println("How r u");
	}
	
	/*public void r()  {
		p();
		System.out.println("How r u buddy");
	}*/
	
	
	public static void main(String[] args) throws IOException  {
		
		ExcDemo obj = new ExcDemo();
		obj.p();
		
	}

}
