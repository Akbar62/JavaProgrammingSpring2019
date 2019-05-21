package officehours13_may14;

public class CreatePeopleHere {
	public static void main(String[] args) {
		// when we use constructors certain actions are being taken during
		// the process of creating the object
		Person John = new Person("01/01/2000");
		System.out.println(John.getBirthday());
		John.setFirstName("John");
		John.setLastName("Doe");

		System.out.println(John.getFirstName());
		System.out.println(John.getLastName());
		System.out.println(John.getBirthday());

		John.setLastName("Smith");
		System.out.println(John.getBirthday());

	}

}
