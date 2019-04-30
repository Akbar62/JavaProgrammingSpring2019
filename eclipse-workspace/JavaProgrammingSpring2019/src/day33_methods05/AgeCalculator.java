package day33_methods05;

public class AgeCalculator {

	public static void main(String[] args) {

		calculateAge(1995);
		System.out.println("");
	}

	public static int calculateAge(int year) {
		int age = 2019 - year;
		if (age < 1) {
			System.out.println("invalid age");
			return 0;
		} else if (age >= 1 && age <= 14) {
			System.out.println("child");
		} else if (age >= 15 && age <= 25) {
			System.out.println("youngster");
		} else if (age >= 26 && age <= 64) {
			System.out.println("adult");
		} else if (age >= 65) {
			System.out.println("senior");
		}
		return age;
	}

}
