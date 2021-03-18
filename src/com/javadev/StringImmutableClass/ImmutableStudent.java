package com.javadev.StringImmutableClass;

public final class ImmutableStudent {
	
	private final int id;
	private final String name;
	private final AgeMutable mutable;
	
	public ImmutableStudent(int id, String name, AgeMutable mutable) {
		this.id=id;
		this.name=name;
		
		AgeMutable cloneAge = new AgeMutable();
		this.mutable=cloneAge;
		
		cloneAge.setDay(mutable.getDay());
		cloneAge.setMonth(mutable.getMonth());
		cloneAge.setYear(mutable.getYear());
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public AgeMutable getAgeMutable() {
		
		AgeMutable cloneObj = new AgeMutable();
		
		cloneObj.setDay(this.mutable.getDay());
		cloneObj.setMonth(this.mutable.getMonth());
		cloneObj.setYear(this.mutable.getYear());
		return mutable;
	}
	
}
