package com.javadev.OOPS;


class parent{
	
	 void m1() {
		System.out.println("m1() from parent");
	}
	
}

class child extends parent{
	
	  void  m1() {
		System.out.println("m1() from child");
	}
	
}

public class Override {
	
	
	public static void main(String[] args) {
		
		parent p = new child();
		p.m1();
		
	}
}
