package oca_practice_questions;

public class Q37 {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();
		//director.stockOptions();
	}
	

}

class Employee {
	public int salary;
}

class Manager extends Employee {
	public int budget;
}

class Director extends Manager {
	public int stockOptions;
}


