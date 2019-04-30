package day33_methods05;

import day31_methods03.Calculator;

public class CalcTest {

	public static void main(String[] args) {

		System.out.println(MethodTypes.add(5, 5));
		System.out.println(MethodTypes.multiply(5,6));
		System.out.println(MethodTypes.minus(40, 2));
		System.out.println(MethodTypes.divide(100, 2));
		
		int addResult = MethodTypes.add(21, 41);
		double mResult = MethodTypes.multiply(21, 41);
		double miResult = MethodTypes.minus(100, 23);
		double dResult = MethodTypes.divide(80, 10);
		
		System.out.println("addResult "+addResult);
		System.out.println("mResult "+mResult);
		System.out.println("miResult "+miResult);
		System.out.println("dResult "+dResult);
		
		double a = 10.00, b = 5.0;
		double myResult = MethodTypes.minus(a, b);
		
		
		
	}

}
