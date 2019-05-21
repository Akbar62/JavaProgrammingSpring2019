package day46_static_keyword;

public class Ebay {
	public static void main(String[] args) {
		Customer cm1 = new Customer("Abdallah Aleies" , "abdallahaleies@gmail.com");
		Customer cm2 = new Customer("Adilet Kyrgyz" , "adiletkyrgyz@yahoo.com");
		Customer cm3 = new Customer("Anastasia Zasbina" , "anastasia@outlook.com");
		
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		Customer cm4 = new Customer("Burak Ucal" , "burak@yahoo.com");
		System.out.println("Total customers: "+ Customer.count);
		
		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		// one centralized variable that is shared by everything
	}

}
