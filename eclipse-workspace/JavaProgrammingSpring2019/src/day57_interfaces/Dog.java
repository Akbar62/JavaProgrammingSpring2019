package day57_interfaces;

public class Dog implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("Dog is responding");
	}

	@Override
	public void KeepAsPet() {
		System.out.println("Dog is kept in the house or outside");
	}

}
