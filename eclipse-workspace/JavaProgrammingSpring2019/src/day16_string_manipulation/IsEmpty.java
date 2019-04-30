package day16_string_manipulation;

public class IsEmpty {

	public static void main(String[] args) {

		String username = "";
		String password = "";
		System.out.println(username.isEmpty());

		if (username.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password fields cannot be empty");
		} else {
			System.out.println("Username or fields not empty");
		}

		if (username.length() == 0) {
			System.out.println("Username length is 0 so it is empty");
		}
		
	}

}
