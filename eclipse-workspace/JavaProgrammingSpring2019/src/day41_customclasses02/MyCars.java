package day41_customclasses02;

public class MyCars {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Black";
		car1.currentSpeed = 70;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(65);
		car1.drive();

	}

}
