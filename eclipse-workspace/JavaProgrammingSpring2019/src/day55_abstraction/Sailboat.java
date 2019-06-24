package day55_abstraction;

public class Sailboat extends Vehicle {
	private int length;

	public Sailboat(double price, int length) {
		super(0, price, "Sailboat", "wind");
	}

	@Override
	public void move() {

	}

}
