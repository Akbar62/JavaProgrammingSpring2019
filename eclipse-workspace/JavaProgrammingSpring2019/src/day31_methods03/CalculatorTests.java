package day31_methods03;

import java.util.*;

public class CalculatorTests {

	public static void main(String[] args) {
		Calculator.add(34, 5);

		// Using a scanner pass 2 numbers and an operator

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+','-','*','/','%' ");
		String operator = scan.next();

		switch (operator) {
		case "+":
			Calculator.add(n1, n2);
			break;
		case "-":
			Calculator.subtract(n1, n2);
			break;
		case "*":
			Calculator.multiply(n1, n2);
			break;
		case "/":
			Calculator.divide(n1, n2);
			break;
		case "%":
			Calculator.remainder(n1, n2);
			break;
		default:
			System.out.println("Invalid operation");

		}
	}

}
