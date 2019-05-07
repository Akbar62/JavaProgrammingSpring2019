package day37_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Honda");
		// declare and add values in a single statement
		// Arrays class
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());

		// create arraylist prices
		// assign values using Arrays.asList method
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50, 5.99, 12.0, 9874.44, 34.3, 123.5, 7.3);

		System.out.println(prices);
		// calculate sum of all prices
		double sum = 0;

		for (double dubz : prices) {
			sum += dubz;
		}

		System.out.println(sum);

		sum = 0;

		for (int i = 0; i < prices.size(); i++) {
			sum += prices.get(i);
		}

		System.out.println(sum);
		
		// create new List expensive
		// add prices that are more than 100
		sum = 0;
		
		List<Double> expensive = new ArrayList<>();
		
		for(double dubz: prices) {
			if(dubz > 100) {
				expensive.add(dubz);
			}
		}
		
		System.out.println(expensive.toString());
		

	}

}
