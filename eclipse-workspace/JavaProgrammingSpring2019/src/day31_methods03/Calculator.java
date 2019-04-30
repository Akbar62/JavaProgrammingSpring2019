package day31_methods03;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		add(2, 4);
		subtract(4, 3);
		multiply(3, 4);
		divide(5, 1);
		remainder(6, 2);
	}

	// add, subtract, multiply, divide, remainder

	public static void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Result: " + sum);

	}

	public static void subtract(double num1, double num2) {
		double sum = num1 - num2;
		System.out.println("Result: " + sum);
	}

	public static void multiply(double num1, double num2) {
		double sum = num1 * num2;
		System.out.println("Result: " + sum);
	}

	public static void divide(double num1, double num2) {
		double sum = num1 / num2;
		System.out.println("Result: " + sum);
	}

	public static void remainder(double num1, double num2) {
		double sum = num1 % num2;
		System.out.println("Result: " + sum);
	}

}
