package day57_interfaces;

public class Cat implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("The cat says meow");
	}

	@Override
	public void KeepAsPet() {
		System.out.println("Cat is kept in the house");
	}

}
