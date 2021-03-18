package com.javadev.RuntimePolymorphism;

public class Student {
	
	private static  Cheat cheat;

	public static void main(String[] args) {

		cheat= new MathCheat();
		cheat.cheating();
		
		cheat = new ScienceCheat();
		cheat.cheating();

	}

}
