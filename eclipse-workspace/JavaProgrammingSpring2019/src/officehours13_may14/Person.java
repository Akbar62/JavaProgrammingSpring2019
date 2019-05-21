package officehours13_may14;

public class Person {

	private String firstName;
	private String lastName;
	private String birthday;

	// the constructor takes an argument, In the body of the constructor
	// we are assigning the argument to birthday
	// Whenever we want to create an object, we have to provide the constructor
	public Person(String bDay) {
		System.out.println("constructing");
		birthday = bDay;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	// we will not have public set birthday
//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}

}
