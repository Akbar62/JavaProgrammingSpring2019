package day37_arraylist;

import java.util.ArrayList;

public class Shopping {
	
	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("milk");
		shoppingList.add("eggs");
		shoppingList.add("bread");
		shoppingList.add("cheese");
		shoppingList.add("meat");
		shoppingList.add("water");
		
		// print number of items
		int count = shoppingList.size();
		System.out.println("Total count: "+count);
		// print all items in a single line
		System.out.println(shoppingList.toString());
		// print first and last item
		System.out.println(shoppingList.get(0)+", "+shoppingList.get(1));
		
		for(String item: shoppingList) {
			System.out.println(item);
		}
		
		// remopve all items at once
		shoppingList.clear();
		System.out.println(shoppingList);
	}

}
