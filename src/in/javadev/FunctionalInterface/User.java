package in.javadev.FunctionalInterface;

public class User {
	
	private String name;
	private Integer age = 30;
	
	public User(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name = " + name + "  Age = " + age;
	}
}
