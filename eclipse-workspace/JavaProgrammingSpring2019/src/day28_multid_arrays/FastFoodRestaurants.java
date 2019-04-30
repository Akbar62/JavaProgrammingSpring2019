package day28_multid_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {

		// read all data and assign to array

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);

		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length - 1]);

		int counter = 0;

		for (String str : data) {
			System.out.println(str);
			counter++;
		}
		System.out.println("########################");
		System.out.println("There are are " + counter + " values in the array");

		// Print all restaurant information in state of VA
		int counter2 = 0;

		for (String str2 : data) {
			if (str2.contains(",VA,")) {
				System.out.println(str2);
				counter2++;
			}
		}
		System.out.println("Total restaurants in VA: "+counter2);
		
		//Find all restaurant information in the state of VA
		//Print the restaurant names along with city name
		
		for(String res: data) {
			if(res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
		
		
//		String str3 = Arrays.toString(data);
//		
//		String[] data2 = str3.split(",");
//		
//		for(int i = 0; i <= data2.length-1;i++) {
//			System.out.println(data2[i+1]+data2[i+2]);
//		}
		
	}

}
