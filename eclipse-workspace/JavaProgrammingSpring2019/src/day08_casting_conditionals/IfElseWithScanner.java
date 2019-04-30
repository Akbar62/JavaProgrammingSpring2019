package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseWithScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int passingPercentage = 65;
		System.out.println("What is your score percentage? ");
		int yourScorePercentage = scan.nextInt();
		
		if(yourScorePercentage >= passingPercentage) {
			System.out.println("Congrats, you passed!");
		} else {
			System.out.println("Better luck next time");
		}
		
		System.out.println("Java is fun?");
	}

}
