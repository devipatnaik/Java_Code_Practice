package com.javadev.Boolean;

public class EMployee {
		
		private  int empid=0;
		private String empName;
		
	public EMployee(int empid, String empName) {
		System.out.println(this.empid);
		
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
	
	
	String s1 = "devi";
	String s2=s1.concat("patnaik");
	System.out.println(s2.substring(8));
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	String str1="FB";
	String str2="Ea";	
	System.out.println(str1.hashCode() + "===" + str2.hashCode());
	System.out.println(str1.equals(str2));
	System.out.println(str1==str2);
	
	}

}
