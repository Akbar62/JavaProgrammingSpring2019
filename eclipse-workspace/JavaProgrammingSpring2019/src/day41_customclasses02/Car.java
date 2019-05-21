package day41_customclasses02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		System.out.println("car make[" + make + "]. model[" + model + "], color[" + color + "], currentSpeed["
				+ currentSpeed + "]");
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at " + currentSpeed + ", following speed limit -" + speedLimit);
		} else {
			System.out.println(make + " is driving at " + currentSpeed + ", over the speed limit -" + speedLimit);
		}
	}

	public void drive() {
		System.out.println(make + " " + model + " is driving");
	}
	
	public void accelerate(int mph) {
		currentSpeed += mph;
	}

}
