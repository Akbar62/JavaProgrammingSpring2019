package day37_arraylist;
import java.util.*;

public class MyCitiesAndMethods {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		
		// print each city using a for each loop
		for(String city: cities) {
			System.out.print(city+" ");
		}
		System.out.println();
		// print each city using a for loop
		for(int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
		
		// remove Baku
		System.out.println("Remove Baku");
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println(cities.toString());
		
		// Is it empty?
		System.out.println("Is list empty? "+ cities.isEmpty());
		cities.add(0, "Bishkek");
		
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		// find Sterling in the list and give the index
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index: "+ idx);
		cities.set(idx, "Zagreb");
		
		System.out.println(cities.toString());
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("empty: "+empty);
	}

}
