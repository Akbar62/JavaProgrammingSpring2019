package day13_ternary_strings_intro;
import java.util.*;
public class RealTipCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Split or No split");
		String split = scan.next();
		
		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();
		
		System.out.println("Check amount");
		double checkAmount = scan.nextDouble();
		
		System.out.println("Service Quality");
		String serviceQuality = scan.next();
		
		double totalTip = 0;
		
		switch(serviceQuality) {
			case "Poor":
			totalTip = checkAmount* 0.05;
			break;
			case "Fair":
			totalTip = checkAmount* 0.10;
			break;
			case "Good":
			totalTip = checkAmount* 0.15;
			break;
			case "Great":
			totalTip = checkAmount* 0.20;
			break;
			case "Excellent":
			totalTip = checkAmount* 0.25;
			break;
			default:
				System.out.println("Invalid input");
		}
			
			switch(numberOfPeople) {
			case 1:
			System.out.println("&");
			break;
			case 2:
			System.out.println("&&");
			break;
			case 3:
			System.out.println("&&&");
			break;
			case 4:
			System.out.println("&&&&");
			break;
			case 5:
			System.out.println("&&&&&");
			break;
			case 6:
			System.out.println("&&&&&&");
			break;
			case 7:
			System.out.println("&&&&&&&");
			break;
			case 8:
			System.out.println("&&&&&&&&");
			break;
			case 9:
			System.out.println("&&&&&&&&&");
			break;
			case 10:
			System.out.println("&&&&&&&&&&");
			break;
			}
			
			double totalAmount = checkAmount + totalTip;
			
			System.out.println("Total to pay: "+checkAmount+totalTip);
			System.out.println("Total tip: "+totalTip);
			
			
			switch(split) {
			case "Yes":
			System.out.println("Total per person: "+(checkAmount+totalTip) / numberOfPeople);
			System.out.println("Tip per person: "+ totalTip / numberOfPeople);
			
			case "No":
			System.out.println("Total per person: "+(checkAmount+totalTip));
			System.out.println("Tip per person: "+totalTip);
			
				
			}
				
		

	}

}
