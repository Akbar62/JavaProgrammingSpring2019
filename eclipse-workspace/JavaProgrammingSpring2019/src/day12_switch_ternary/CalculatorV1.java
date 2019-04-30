package day12_switch_ternary;
import java.util.*;
public class CalculatorV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		if(operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("%")) {
			result = num1 % num2;
		} else {
			System.out.println("Invalid operator selected");
			return;
		}
		System.out.println("Results: "+result);
	}

}
