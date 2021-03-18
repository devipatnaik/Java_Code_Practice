package com.javadev.EqualsAndHashCode;

public class Employee {
	
	private Long id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = (long) id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
