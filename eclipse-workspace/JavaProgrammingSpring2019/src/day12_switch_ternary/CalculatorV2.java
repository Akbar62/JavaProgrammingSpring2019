package day12_switch_ternary;
import java.util.*;
public class CalculatorV2 {

	public static void main(String[] args) {
		double num1, num2, result;
		String operator;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = input.nextDouble();
		System.out.println("Enter second number");
		num2 = input.nextDouble();
		System.out.println("Select operator: +,-,*,/,%");
		operator = input.next();
		result = 0.0;
		
		switch (operator) {
			case "+":
			result = num1 + num2;
			System.out.println("Result is: " + result);
			break;
			case "-":
			result = num1 - num2;
			System.out.println("Result is: " + result);
			break;
			case "*":
			result = num1 * num2;
			System.out.println("Result is: " + result);
			break;
			case "/":
			result = num1 / num2;
			System.out.println("Result is: " + result);
			break;
			case "%":
			result = num1 % num2;
			System.out.println("Result is: " + result);
			break;
			default:
			System.out.println("Incorrect input");
			
			
		}

	}

}
