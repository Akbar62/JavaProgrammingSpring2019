package day21_loopsPractice;
import java.util.*;
public class Register {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int itemAmount = 0;
		String allItems = "";
		double totalPrice = 0;
		double eachItem = 0;
		String item = "";
		
		System.out.println("How many items are you purchasing?");
		itemAmount = scan.nextInt();
		
		
		for(int count = 1; count <= itemAmount; count++) {
			System.out.println("What is item "+count+ "?");
			item = scan.next();
			System.out.println("How much is "+item+"?");
			eachItem = scan.nextDouble();
			
			allItems += item +", ";
			totalPrice += eachItem;
			
		}
		if(allItems.endsWith(", ")) {
			allItems = allItems.substring(0, allItems.length()-1);
		}

		//allItems = items
		System.out.println("Your items are "+allItems.substring(0, allItems.length()-1));
		System.out.println("Your total price is: "+totalPrice);
		
		//System.out.println("What is the price of each item?");
		//eachItem = scan.nextDouble();
		

	}

}
