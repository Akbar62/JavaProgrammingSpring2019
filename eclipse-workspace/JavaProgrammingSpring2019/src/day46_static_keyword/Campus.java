package day46_static_keyword;

public class Campus {
	private String city;
	static String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// static block
	// code in static block executes once and before everything else
	// whenever the class is used.
	// Usually we can place initializations or set up code into static block
	static {
		System.out.println("static block");
		country = "USA";
	}
	
	static {
		System.out.println("static block - 2");
		country = "Canada";
	}

	public Campus(String city) {
		System.out.println("constrcutor");
		this.city = city;
	}

}
