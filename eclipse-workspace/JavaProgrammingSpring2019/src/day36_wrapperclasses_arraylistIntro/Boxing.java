package day36_wrapperclasses_arraylistIntro;

public class Boxing {
	
	public static void main(String[] args) {
		
		// Auto boxing
		// Converting from a primitive to a wrapper class object
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: "+ d1);
		System.out.println("d2: "+ d2);
		
		long l1 = new Long(6000000); // unboxing
		Long l2 = new Long(34543543L); // no boxing
		long l3 = l2; //auto unboxing
		Long l4 = l3; // auto boxing
		
		
	}

}
