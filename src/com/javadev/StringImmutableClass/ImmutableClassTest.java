package com.javadev.StringImmutableClass;

import java.util.Date;

public final class ImmutableClassTest {
	
	private final Integer immutable1;
	private final String immutable2;
	private final Date mutable1;
	
	public ImmutableClassTest(Integer immutable1,String immutable2, Date date) {
		this.immutable1 = immutable1;
		this.immutable2= immutable2;
		this.mutable1 = new Date(date.getTime());
	}
	
	public static  ImmutableClassTest createNewInstance(Integer i1,String i2, Date date) {
		
		return new ImmutableClassTest(i1, i2, date);
		
	}

	public Integer getImmutable1() {
		return immutable1;
	}

	public String getImmutable2() {
		return immutable2;
	}

	public Date getMutable1() {
		return new Date(mutable1.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableClassTest [immutable1=" + immutable1 + ", immutable2=" + immutable2 + ", mutable1=" + mutable1
				+ "]";
	}
	
	
	public static void main(String[] args) {
		
		ImmutableClassTest obj = ImmutableClassTest.createNewInstance(100, "Devi", new Date());
		System.out.println(obj);
		
		updtae(obj.immutable1,obj.immutable2,obj.mutable1);
		System.out.println(obj);
	}

	public static void updtae(Integer immutable11, String immutable22, Date mutable11) {
		
		immutable11 = 200;
		immutable22 = "Raja";
		mutable11.setDate(30);
		
	}
	
}
