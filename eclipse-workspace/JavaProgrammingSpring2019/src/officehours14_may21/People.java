package officehours14_may21;

public class People {
	
	String hardToGet = "Nursultan";
	
	static String easyToGet = "Muhtar";
	
	public void sayMyName() {
		System.out.println(hardToGet);
		// non static method can call static variables
		System.out.println(easyToGet);
	}
	
	public static void whatMyName() {
		System.out.println(easyToGet);
		// next line will throw an error because
		// static methods cannot call non static
		//System.out.println(hardToGet);
	}

}
