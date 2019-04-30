package day18_while_dowhile_loops;

import java.util.*;

public class CarInsuranceQuote {

	public static void main(String[] args) {
		
		double premium = 0;
		double accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		int zipcode = 0;
		int yearsDriving = 0;
		//int days = 0;
		int age = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		String license = "";
		String accidents = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		
		System.out.println("Do you have a US driver license?");
		license = scan.nextLine();
		if(license.equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			return;
		} 
		
		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();
		if(zipcode == 20910 || zipcode == 20740) {
			premium = premium + 60;
		} else if(zipcode == 22102 || zipcode == 22103) {
			premium = premium + 30;
		} else {
			premium = premium + 50;
		}
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		scan.nextLine();
		vehicleOwnership = scan.nextLine();
		//scan.nextLine();
		if(vehicleOwnership.equalsIgnoreCase("owned")) {
			premium = premium + 10;
		} else {
			premium = premium + 20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.nextLine();
		if(vehicleUsage.equalsIgnoreCase("Business")) {
			premium = premium + 50;
		} else if(vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium = premium + 10;
		} 
		
		if(vehicleUsage.equalsIgnoreCase("Commute")) {
			premium = premium + 20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			
			switch(daysDrivenToWorkOrSchool) {
				case 1:
				premium = premium + 5;
				break;
				case 2:
				premium = premium + 10;
				break;
				case 3:
				premium = premium + 15;
				break;
				case 4:
				premium = premium + 20;
				break;
				case 5:
				premium = premium + 25;
				break;
				case 6:
				premium = premium + 30;
				break;
				case 7:
				premium = premium + 35;
				break;
			
			}
			
		}
		
		
		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool = scan.nextInt();
		premium = milesToWorkOrSchool + premium;
		
		System.out.println("How old are you?");
		age = scan.nextInt();
		
		if(age <16) {
			System.out.println("Invalid data!");
			return;
		} else if(age == 16 || age == 17) {
			premium = premium * 20;
		} else if(age == 18 || age == 19 || age == 20 || age == 21) {
			premium = premium * 6;
		} else if(age == 22 || age == 23 || age == 24) {
			premium = premium * 2;
		}
		
		System.out.println("How many years you've been driving?");
		yearsDriving = scan.nextInt();
		
		if(yearsDriving > 0 && (age - yearsDriving) >= 16) {
			premium = premium - (yearsDriving * 5);
		} else if(yearsDriving > 0 && (age - yearsDriving) <= 16) {
			System.out.println("Invalid data!");
		}
		
		System.out.println("Have you had any accidents in the last 5 years?");
		accidents = scan.nextLine();
		scan.nextLine();
		
		if(accidents.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextDouble();
			premium = premium + (accidentsAmount * 0.20);
		}
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.nextLine();
		
		if(continuousInsurance.equalsIgnoreCase("no")) {
			premium = premium * 2;
		}
		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		
		if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
			premium = premium - (premium * 0.05);
		} else if(education.equalsIgnoreCase("Doctors")) {
			premium = premium - (premium * 0.10);
		} else if(education.equalsIgnoreCase("Less than High School")) {
			premium = premium + (premium * 0.05);
		} else {
			System.out.println("Invalid input");
		}
		
		String education2 = education.toUpperCase().replace(" ", "");
		System.out.println(name+", here's your quote!");
		System.out.println("Start Your Policy Today For: $"+premium);
		referenceNumber = name.toUpperCase().charAt(0) +""+name.toUpperCase().charAt(1) + ""+age+name.toUpperCase().substring(name.length()-2, name.length()-1) + zipcode + education2;
		System.out.println("Reference number: "+referenceNumber);
		
		
	}

}
