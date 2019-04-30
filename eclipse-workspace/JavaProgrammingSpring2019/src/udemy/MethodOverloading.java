package udemy;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(Calc(12, 8));

	}

	public static String Calc(double feet, double inches) {

		if (feet < 0 || inches < 0 || inches > 12) {
			return "-1";
		}

		double centis = (feet * 12) * 2.54;
		centis += (inches * 2.54);

		feet = centis / 12;
		inches = (centis % 12) / 2.54;

		return feet + " feet and " + inches;

	}

}
