package day32_methods04;

public class MethodsWithReturn {
	
	public static void main(String[] args) {
		System.out.println(giveMe$10());
		
		String name = giveMeYourName();
		System.out.println(name);
	}
	
	public static int giveMe$10() {
		return 10;
	}
	
	public static String giveMeYourName() {
		return "Akbar";
	}

}
