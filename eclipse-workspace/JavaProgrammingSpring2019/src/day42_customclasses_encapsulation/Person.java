package day42_customclasses_encapsulation;

public class Person {
	// declare name and age encapsulated data
	private String name;
	private int age;
	
//	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "Jim";
//		p1.age = 1;
//	}
	
	// public getter and setter methods for name
	// read only (getter)
	public String getName() {
		return name;
	}
	
	// write only (setter)
	public void setName(String name) {
		// this. points to instance variables
		this.name = name;
	}

}
