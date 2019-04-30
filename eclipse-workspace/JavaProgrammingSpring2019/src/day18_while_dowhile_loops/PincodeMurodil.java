package day18_while_dowhile_loops;
import java.util.*;
public class PincodeMurodil {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int secretPincode = 4321;
		int pincode = 0;
		int attempts = 0;
		
		while(pincode != secretPincode) {
			System.out.println("enter pin");
			pincode = scan.nextInt();
			attempts++;
			
			if(attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked");
				return;
			}
		}
		

	}

}
