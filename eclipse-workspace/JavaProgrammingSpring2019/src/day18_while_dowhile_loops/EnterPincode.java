package day18_while_dowhile_loops;
import java.util.*;
public class EnterPincode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;
		
		int pincode = 0;
		
		int attempts = 0;
		
		while(secretPincode != pincode) {
			System.out.println("Whats your pin");
			pincode = scan.nextInt();
			if(secretPincode != pincode) {
				System.out.println("Invalid Pin");
				attempts++;
				if(attempts >= 3) {
					System.out.println("Card blocked");
					return;
				}
			}
		}
		
		System.out.println("Correct: Access Granted");
	}

}
