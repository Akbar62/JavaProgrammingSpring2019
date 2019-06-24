package day55_abstraction;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("Dog says woof");
	}
	
	public void eat() {
		System.out.println(getName() + " eats");
	}
}
