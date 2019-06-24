package day55_abstraction;

public abstract class Shape {
	String name;
	double area;

	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double calculateArea();
	
	public abstract void draw();
	

}
