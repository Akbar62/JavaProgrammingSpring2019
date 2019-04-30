package day31_methods03;

public class Authentication {

	public static void main(String[] args) {

		login("mentoring@cybertekschool.com", "mentor001");

	}

	public static void login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";

		if (validUsername.equalsIgnoreCase(username) && validPassword.equals(password)) {
			System.out.println("Login successfull! Welcome to Okta!");
		} else {
			System.out.println("Log in failed");
		}

	}

}
