package day55_abstraction;

public class Circle extends Shape {
	double radius;

	public Circle(String name) {
		super("Circle");
	}
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public void draw() {
		
	}
	

}
