package day08_casting_conditionals;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		int votingAge = 18;
		System.out.println("Whats your age? ");
		Scanner scan = new Scanner(System.in);
		int yourAge = scan.nextInt();
		
		if(yourAge >= votingAge) {
			System.out.println("Your are eligible to vote");
			System.out.println("You have been eligible for " + (yourAge - votingAge)  + " years");
		} else {
			System.out.println("Your are not eligible to vote");
			System.out.println("You still have " + (votingAge - yourAge) + " years to go");
		}

	}

}
