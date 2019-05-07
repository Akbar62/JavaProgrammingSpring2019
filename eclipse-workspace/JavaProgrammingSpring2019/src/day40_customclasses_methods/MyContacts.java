package day40_customclasses_methods;

public class MyContacts {

	public static void main(String[] args) {
		// create contact object
		Contact evgenia = new Contact();
		evgenia.name = "Evgenia Jalilova";
		evgenia.phoneNumber = "(202) 333-4444";
		evgenia.email = "Evgenia@thorlabs.com";

		System.out.println(evgenia.name);
		System.out.println(evgenia.phoneNumber);
		System.out.println(evgenia.email);

		evgenia.call();
		evgenia.sendMessage();
		evgenia.sendEmail();

		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571) 991-3322";
		orhan.email = "orhan@google.com";

		System.out.println("Name: " + orhan.name);
		System.out.println("Phone number: " + orhan.phoneNumber);
		System.out.println("Email: " + orhan.email);

		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();

	}

}
