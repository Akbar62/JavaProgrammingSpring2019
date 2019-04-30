package day21_loopsPractice;
import java.util.*;
public class ShoppingList2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String oneMore = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			
			do {
			  System.out.println("Enter Item"+count+" and its price:");
			  item = scan.next();
			  price += scan.nextDouble();
			  System.out.println("Add one more item?");
			  oneMore = scan.next();
			  shoppingListReport += "Item"+count+" : "+item+" Price: "+price+", ";
			  
			}while(oneMore.equalsIgnoreCase("yes")); {
				count++;
			}
			
			System.out.println(shoppingListReport);
			System.out.println("Total price: "+price);
	}

}
