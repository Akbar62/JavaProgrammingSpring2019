package day25_arrays03;

public class Population {

	public static void main(String[] args) {

		int[] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;
		// Order doesn't matter ^
		// int[] population = {5000, 10000, 7000, 4455, 8907};

//		System.out.println("City 0 population :"+population[0]);
//		System.out.println("City 1 population :"+population[1]);
//		System.out.println("City 2 population :"+population[2]);
//		System.out.println("City 3 population :"+population[3]);
//		System.out.println("City 4 population :"+population[4]);

		for (int i = 0; i < population.length; i++) {
			System.out.println("City " + i + " population :" + population[i]);
		}

		String str = "abc";
		System.out.println("City 1 population :" + population[str.length()]);
		
		String[] cities = {"Miami" , "London" , "Tokyo" , "Rome" , "New York"};
		
		//System.out.println("The population of "+cities[0]+" is "+population[0]);
		
		for(int i = 0; i < cities.length;i++) {
			System.out.println("The population of "+cities[i]+" is "+population[i]);
		}

	}

}
