package day10_logicaloperators_conditionals;
import java.util.*;
public class CreditScoreRating {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score:");
		int creditScore = 800;
		
		if(creditScore >= 750 && creditScore <= 850) {
			System.out.println("You have excellent credit!");
			
		}else if(creditScore >= 700 && creditScore <= 749) {
			System.out.println("You have good credit!");
		}else if (creditScore >= 650 && creditScore <= 699) {
			System.out.println("You have fair credit!");
		}else if (creditScore >= 550 && creditScore <= 649) {
			System.out.println("You have poor credit!");
		}else if (creditScore >= 0 && creditScore <= 549) {
			System.out.println("You have bad credit!");
		}else {
			System.out.println("Invalid score");
		}
			
	}

}
