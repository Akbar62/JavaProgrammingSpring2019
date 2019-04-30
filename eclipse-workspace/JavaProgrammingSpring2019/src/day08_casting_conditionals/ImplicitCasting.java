package day08_casting_conditionals;

public class ImplicitCasting {

	public static void main(String[] args) {
		//automatic casting from a smaller to a larger type
		
		short shortValue = 3455;
		int intValue = (int)shortValue;
		//int intValue = (int)shortValue is optional
		System.out.println();
		
		double price = 345;
		System.out.println("Price after casting: " + price);
		
		int price1 = 3456;
		double dPrice = price1;
		System.out.println("dPrice after casting: " + dPrice);
	}

}
