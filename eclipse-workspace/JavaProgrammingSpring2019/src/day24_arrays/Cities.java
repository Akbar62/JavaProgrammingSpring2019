package day24_arrays;

import java.util.Arrays;

public class Cities {

	public static void main(String[] args) {

		String[] cities = { "Washington D.C. ", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku", "Miami",
				"Silver Spring", "McLean" };
		System.out.println(cities.length);

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		
		//Same thing but with a For Each loop
		for(String city: cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}

	}

}
