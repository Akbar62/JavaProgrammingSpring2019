package udemy;

import java.util.*;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public ArrayList<Contact> getMyContacts() {
		return myContacts;
	}

	public void setMyContacts(ArrayList<Contact> myContacts) {
		this.myContacts = myContacts;
	}

}
