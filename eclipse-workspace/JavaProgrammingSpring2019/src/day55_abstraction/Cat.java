package day55_abstraction;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("Cat says meow");
		
	}
	
	public void eat() {
		System.out.println(getName() + " eats");
	}
	
	public void produceMilk() {
		
	}
	

}
