package day60_polymorphism02;

//import day59_polymorphism.*;
import java.util.*;
import day59_polymorphism.*;

// Not working right because of previous day's class??????

public class ShapesArray {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.draw();

		Shape[] shapes = { new Triangle(), new Circle(), new Square(), new Triangle(), new Circle(), new Square() };
		shapes[0].draw();
		shapes[1].draw();

		System.out.println("### FOR EACH LOOP ###");

		for (Shape x : shapes) {
			x.draw();
		}

		List<Shape> shp1 = new ArrayList<>();
		shp1.add(new Triangle());
		shp1.add(new Circle());
		shp1.add(new Square());
		shp1.add(new Triangle());
		shp1.add(new Circle());

		shp1.get(0).draw();

		for (Shape y : shp1) {
			System.out.println(shp1.getClass().getSimpleName().toUpperCase());
			y.draw();
		}

		System.out.println("#### FOR LOOP####");

		for (int i = 0; i < shp1.size(); i++) {
			System.out.println(shp1.get(i).getClass().getSimpleName().toUpperCase());
			shp1.get(i).draw();
		}

	}

}
