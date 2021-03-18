package com.javadev.basic;

public class Edureka1 {
	static int e_x;
	 int e_y;
	public Edureka1(int x, int y) {
		e_x=x;
		e_y=y;
	}

	public static void main(String[] args) {
		Edureka1 edu1 = new Edureka1(e_x, e_x);
		System.out.println(edu1.e_x);
		System.out.println(edu1.e_y);
	}

}
