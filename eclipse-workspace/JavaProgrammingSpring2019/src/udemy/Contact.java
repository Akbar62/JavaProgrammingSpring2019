package udemy;

public class Contact extends MobilePhone {

	private String name;
	private String phoneNumber;

	public Contact(String myNumber) {
		super(myNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
