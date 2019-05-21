package officehours14_may21;

public class EmailGenerator {
	
	static String companyName;
	
	String name;
	
	public EmailGenerator(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return name + "@" + companyName+ ".com";
	}

}
