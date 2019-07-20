package day63_exceptions02;

public class ThrowAndThrows {
	public static void main(String[] args) {
		System.out.println("Hello world");
		//throw new RuntimeException("This is thrown using the throw keyword");
		String username = "user01";
		if(username.length() == 0) {
			throw new RuntimeException("Username cannot be empty");
		} else {
			System.out.println("Valid username");
		}
		
		
	}
	

}
