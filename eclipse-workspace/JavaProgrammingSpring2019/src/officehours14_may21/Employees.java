package officehours14_may21;

public class Employees {
	public static void main(String[] args) {
		EmailGenerator.companyName = "Deloitte";
		EmailGenerator e1 = new EmailGenerator("Roman");

		System.out.println(e1.getEmail());

		EmailGenerator e2 = new EmailGenerator("Florian");

		System.out.println(e2.getEmail());
		
		EmailGenerator.companyName = "Shmeloitte";
		// both objects will have a different company name
		// in the email because of the value of the static variable
		// applies to all objects
		
		System.out.println(e1.getEmail());
		System.out.println(e2.getEmail());
	}

}
