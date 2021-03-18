package com.javadev.StringImmutableClass;

public class ImmutableTest {
	
	public static void main(String[] args) {
		
		AgeMutable obj = new AgeMutable();
		obj.setDay(1);
		obj.setMonth(1);
		obj.setYear(1995);
		
		ImmutableStudent is = new ImmutableStudent(1, "raja", obj);
		System.out.println("before modification : "+is.getAgeMutable().getYear());
		
		obj.setYear(1996);
		
		System.out.println("after modification : "+is.getAgeMutable().getYear());
	}

}
