package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle type:");
		int carType = scan.nextInt();
		System.out.println("Is it rush hour? yes | no");
		String answer = scan.next();
		
		boolean isRushHour;
		if(answer.equalsIgnoreCase("yes")) {
			isRushHour = true;
		} else {
			isRushHour = false;
		}
		
		
		double price = 0.0;
		
		if(carType == 1) {
			if(isRushHour) {
				price = 30.0;
			} else {
				price = 5.0;
			}
		} else if(carType == 2) {
			if(isRushHour) {
				price = 55.30;
			} else {
				price = 15.99;
			}
		}
		
			System.out.println("Toll cost: " + price);
	}

}
