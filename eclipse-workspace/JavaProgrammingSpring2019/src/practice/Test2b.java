package practice;

public class Test2b {

	public static void main(String[] args) {

		char A = 'U';

		Numbers(A);
		
		int num = (int) 20L;
		
		System.out.println(num);
		
		String totalNumber = "200" ;

		int Total = Integer.valueOf( totalNumber);
		int Total2 = Integer.parseInt( totalNumber);
		int Total3 = new Integer ( totalNumber );
		
		System.out.println(Total);
		System.out.println(Total2);
		System.out.println(Total3);

	}

	public static void Numbers(int num1) {

		System.out.println("int number: " + num1);

	}

	public static void Numbers(double num1) {

		System.out.println("double number: " + num1);

	}

	public static void Numbers(short num1) {

		System.out.println("short number: " + num1);

	}

}
