package day24_arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// 1. Create an array of strings, store these cars inside the array

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };

		// 2. Print cars that start with an M
		int i = 0;
		for (i = 0; i < cars.length; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);

			}
		}

		System.out.println("#############");

		for (String c : cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("##############");

		// 3. Print all cars that contains the letter "r" somewhere in the name
		// Please make your case insensitive

		for (String c : cars) {
			if (!c.toLowerCase().contains("r")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("###########");

		// 4. Print all car names that end with an "A"
		for (String end : cars) {
			if (!end.endsWith("a")) {
				continue;
			}
			System.out.println(end);
		}

		System.out.println("#############");

		// 5. Print all cars that have at least 6 letters

		for (String six : cars) {
			if (six.length() >= 6) {
				System.out.println(six);
			}
		}

		System.out.println("#############");

		// 6. Swap first and last value in the array

		String temp = cars[0];
		cars[0] = cars[cars.length - 1];
		cars[cars.length - 1] = temp;
		System.out.println(Arrays.toString(cars));

		System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
	}

}
