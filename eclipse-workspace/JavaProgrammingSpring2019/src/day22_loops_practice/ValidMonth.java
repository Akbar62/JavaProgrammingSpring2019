package day22_loops_practice;
import java.util.*;
public class ValidMonth {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int month = 0;
		
		do {
			System.out.println("Enter month");
			month = scan.nextInt();
			
			
		}while(month < 12);
		
		if(month > 12) {
			System.out.println("Invalid entry!");
			
		}

	}

}
