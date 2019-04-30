package day33_methods05;

public class MethodTypes {

	public static void main(String[] args) {

		addVoid(10, 20);
		int sum = add(5, 10);
		System.out.println(sum);
		System.out.println(multiply(5, 5));
		System.out.println(minus(5, 1));
		System.out.println(divide(10, 2));

	}

	public static void addVoid(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);

	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static int multiply(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}

	public static int minus(double a, double b) {
		double sum = a - b;
		return (int) sum;
	}

	public static int divide(int num1, int num2) {
		int sum = num1 / num2;
		return sum;
	}

}
