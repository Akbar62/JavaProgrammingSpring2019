package day12_switch_ternary;
import java.util.*;

class RealEstateCalculator {

	public static void main(String[] args) {
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		Scanner scan = new Scanner(System.in);
		String propertyType;
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		
		System.out.println("Enter your property type:");
	    propertyType = scan.nextLine();
	    if (propertyType.equalsIgnoreCase("Condo")) {
	    	propertyPrice = propertyPrice + 50000;
	    } else if (propertyType.equalsIgnoreCase("Townhouse")) {
	    	propertyPrice = propertyPrice + 75000;
	    } else if (propertyType.equalsIgnoreCase("Single Family Home")) {
	    	propertyPrice = propertyPrice + 95000;
	    }
	    System.out.println("How many bedrooms do you have?");
	    numberOfBedrooms = scan.nextInt();
	    propertyPrice = (numberOfBedrooms * 30000)+propertyPrice;
	    System.out.println("Do you have a backyard?");
	    backyard = scan.nextBoolean();
	    if(backyard ) {
	    	if(propertyType.equals("Condo")){
	    		System.out.println("Backyard is not available for condo!");
		    }else {
		    	propertyPrice = propertyPrice + 5000;
	    	}
	    }
	    System.out.println("Do you have a garage?");
	    garage = scan.nextBoolean();
	    if(garage == true) {
	    	System.out.println("How many spots?");
	    	garageSpots = scan.nextInt();
	    	if (garageSpots <=10){
	            propertyPrice = propertyPrice + (20000*garageSpots);
	            }else{ 
	            System.out.println("Pardon, it's not a public parking!");
	            }
	    System.out.println("How close is the metro station?");
	    metroAccessibility = scan.nextFloat();
	    if (metroAccessibility <= 1) {
	    	propertyPrice = propertyPrice + 10000;
	    } else if (metroAccessibility >= 1 || metroAccessibility <= 3) {
	    	propertyPrice = propertyPrice + 5000;
	    }
	    System.out.println("How close is highway?");
	    highwayAccessibility = scan.nextFloat();
	    if(highwayAccessibility <= 1) {
	    	propertyPrice = propertyPrice + 15000;
	    } else if (highwayAccessibility >= 1 && highwayAccessibility <= 5) {
	    	propertyPrice = propertyPrice + 8000;
	    } else if (highwayAccessibility >=5 && highwayAccessibility <= 20) {
	    	propertyPrice = propertyPrice + 4000;
	    }
		System.out.println("What's the rating of the nearest school?");
		schoolScore = scan.nextFloat();
		if(schoolScore >= 8 && schoolScore <=10) {
			propertyPrice = propertyPrice + 45000;
		} else if (schoolScore < 8 && schoolScore >=4) {
			propertyPrice = propertyPrice + 20000;
		} else {
			propertyPrice = propertyPrice + 5000;
		}
		System.out.println("Does any of your family smoking?");
		smoking = scan.nextBoolean();
		if (smoking == true) {
			propertyPrice = propertyPrice - 5000;
		}
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: "+propertyPrice);
		
		
	}
	
}
}

