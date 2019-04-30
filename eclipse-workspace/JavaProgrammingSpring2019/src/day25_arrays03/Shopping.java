package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = { "Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks" };
		double[] prices = { 120.0, 5.99, 150.50, 3000.5, 6.99 };
		int[] itemID = { 12345, 12346, 12347, 12348, 12349 };
		double totalPrice = 0;

		System.out.println(products.length);

		if (products.length == prices.length && prices.length == itemID.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong with this list");
			return;
		}

		for (int i = 0; i < products.length; i++) {
			System.out.println("Item " + (i + 1) + " " + itemID[i] + ", " + products[i] + ", " + "costs " + prices[i]);
			totalPrice += prices[i];
		}

		System.out.println("########################");
		for (String product : products) {
			System.out.println(product);
		}
		System.out.println("########################");

		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		System.out.println("########################");

		for (int i = itemID.length - 1; i >= 0; i--) {
			System.out.println(itemID[i]);
		}

		System.out.println("Total prices is $" + totalPrice);
		System.out.println("########################");
		
		int maxIndex = 0;
		double maxPrice = 0;
		
		for(int j =0; j < prices.length; j++) {
			if(prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
				
			}
		}
		
		System.out.println(itemID[maxIndex] + " - " + products[maxIndex]+ " -$"+ maxPrice);
		
		
		for(int ak = 0;ak < prices.length;ak++) {
			if(prices[ak] < maxPrice) {
				maxPrice = prices[ak];
				maxIndex = ak;
			}
		}
		
		System.out.println(itemID[maxIndex] + " - " + products[maxIndex]+ " -$"+ maxPrice);
	}

}
