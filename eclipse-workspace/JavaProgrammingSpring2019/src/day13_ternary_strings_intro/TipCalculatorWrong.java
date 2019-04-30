package day13_ternary_strings_intro;
import java.util.*;
public class TipCalculatorWrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double tipPercent = 0;
		String serviceQuality = "";
		double total = 0;
		String split;
		int numberOfPeople = 0;
		int checkAmount;
		
		System.out.println("Split or No split");
		split = scan.next();
		System.out.println("Number of people");
		numberOfPeople = scan.nextInt();
		System.out.println("Number of people entered: "+numberOfPeople);
		if(split.contentEquals("Split")) {
			total = total / numberOfPeople;
		} else if(split.contentEquals("No split")) {
			total = total;
		}
		System.out.println("Service Quality");
		serviceQuality = scan.next();
		
		System.out.println("Check amount");
		checkAmount = scan.nextInt();
		
		if(serviceQuality.contentEquals("Poor")) {
			tipPercent = total * 0.05;
		} else if(serviceQuality.contentEquals("Fair")) {
			tipPercent = total * 0.10;
		} else if(serviceQuality.contentEquals("Good")) {
			tipPercent = total * 0.15;
		} else if(serviceQuality.contentEquals("Great")) {
			tipPercent = total * 0.20;
		} else if(serviceQuality.contentEquals("Excellent")) {
			tipPercent = total + 0.25;
		}
		
		System.out.println(checkAmount+tipPercent);
	}

}
