package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4; //will remove .4
		
		System.out.println("i: " + i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println(dollars);
		
		int count = 44;
		byte byteCount = (byte)count;
		
		int large = 5678;
		short small = (short) large;
		System.out.println("Small : " + small);
		
		int result = (int)(500.4 / 2.0);
		System.out.println("Result: " + result);
		
		
	}

}
