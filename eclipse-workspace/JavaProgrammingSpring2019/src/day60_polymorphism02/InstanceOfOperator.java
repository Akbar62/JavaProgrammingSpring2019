package day60_polymorphism02;

//import day59_polymorphism.Shape;
//import day59_polymorphism.Triangle;
import day59_polymorphism.*;

public class InstanceOfOperator {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());
		
		if(shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a triangle!!!");
		} else if(shape.getClass().getSimpleName().equals("Circle")){
            System.out.println("It is a Circle!");
        } else if(shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a Square!");
        }
		
		
		// same check using instanceof operator
		
		if(shape instanceof Triangle) {
			System.out.println("It is a Triangle!!");
			shape.draw();
		} else if(shape instanceof Circle) {
			System.out.println("It is a Circle!!!");
			shape.draw();
		} else if(shape instanceof Square) {
			System.out.println("It is a Square!!");
			shape.draw();
		}
		
		
		Shape [] shapes = {new Triangle(), new Circle(), new Square(),
				new Triangle(), new Circle(), new Square()};
		
		int circles = 0, squares = 0, triangles = 0;
		
		// using a for each loop, find out the number of each type
		
		for(Shape sh: shapes) {
			if(sh instanceof Circle) {
				circles++;
			} else if(sh instanceof Square) {
				squares++;
			} else if(sh instanceof Triangle) {
				triangles++;
			}
		}
		
		System.out.println("Number of circles " + circles +
						  "\nNumber of squares " + squares +
						  "\nNumber of triangles " + triangles);
		
	}

}
