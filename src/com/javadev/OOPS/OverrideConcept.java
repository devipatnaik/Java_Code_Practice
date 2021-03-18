package com.javadev.OOPS;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 
 * @author devpatna
 * 
 * Case:1
 * From java 1.5 onwards it is possible to have different return type for a overriding method in child class,
 * but child's return type should be sub type of parent's return type, this is called covariant return type.
 * 
 * Case:2
 * access modifier : 
 * child class method access modifier should be higher than parent class method modifier or same can also accessible.
 * 
 * Case:3
 * If Parent class method does not through any exception than child class overridden method should through Un-checked exception.
 * but can not through Checked Exception.
 * 
 * Case:4
 * If Parent class method throws any exception than child class overridden method should through same exception,
 * sub type exception and no exception also fine but cannot through Parent exception..
 */

class Parent11{
	
	public Object show(int a) {
		System.out.println("Parent class..");
		return a;
	}
	
}

class Child11 extends Parent11{
	
	public String show(int a)   {
		System.out.println("Child class..");
		return null;
	}
	
}

public class OverrideConcept {
	
	public static void main(String[] args) {
		
		Parent11 p = new Child11();
		p.show(11);
	}
}
