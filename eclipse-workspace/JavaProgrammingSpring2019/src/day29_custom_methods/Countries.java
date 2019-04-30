package day29_custom_methods;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {

		String[][] countries = {
                {"USA","Washington, DC"},
                {"Canada","Ottawa"},
                {"Mexico", "Mexico City"},
                {"Brasil","Brasilia"},
                {"Peru","Lima"},
                {"Argentina","Buenos Aires"},
                {"Bolivia","La Paz"},
                {"Macedonia","Skopje"},
                {"Kazakhstan","Nursultan"}
            };
		
		System.out.println(countries[0][0] + "|" + countries[0][1]);
		
		System.out.println(Arrays.deepToString(countries));
		
		
		for(int i = 0; i < countries.length; i++) {
			System.out.print(countries[i][0]+"|");
		}
		
		System.out.println();	
		
		String[] cities = new String[countries.length];
		
		for(int i = 0; i < countries.length; i++) {
			cities[i] =countries[i][1];
			
		}
		
		System.out.println(Arrays.toString(cities));
		// Check for Bolivia and if the capital is La Paz
		
		for(int row = 0; row < countries.length; row++) {
			if(countries[row][0].contentEquals("Bolivia")) {
				if(countries[row][1].contentEquals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Boliva test failed");
				}
				break;  //exit the loop
			}
		}
		

	}

}
