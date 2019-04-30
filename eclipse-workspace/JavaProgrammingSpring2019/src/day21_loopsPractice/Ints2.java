package day21_loopsPractice;

import java.util.*;

public class Ints2 {

	public static void main(String[] args) {

		// My version
		//Sum of 2 numbers equaling 100 or not
		
		Scanner scan = new Scanner(System.in);
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();

		if ((int1 + int2) <= 100) {
			while ((int1 + int2) <= 100) {
				System.out.println("What are the 2 nums?");
				int1 = scan.nextInt();
				int2 = scan.nextInt();
				if ((int1 + int2) >= 100) {
					System.out.println("Good numbers");
					System.exit(0);
				}
			}

		}

		// Murodil's version
		/*
		 * 
		 * int sum = 0; //int sumOfSums=0;
		 * 
		 * do { 
		 * System.out.println("Enter 2 numbers");
		 * int num1 = scan.nextInt();
		 * int num2 = scan.nextInt();
		 * sum=num1+num2;
		 *  //sumOfSums += sum; }while(sum <= 100);
		 * 
		 * System.out.println("Good Numbers");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
