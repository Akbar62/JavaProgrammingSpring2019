package day19_loops;

import java.util.*;

public class TransactionsAmount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// double amount = 0;
		int count = 0;
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();

		while (balance > 0) {
			count++;
			System.out.println("What is the transaction #"+count+" amount?");
			double transaction = scan.nextDouble();
			if(transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction");
				continue; //Go to the top of the loop right away
			}
			balance -= transaction;
			System.out.println("Current balance: "+balance);
			
		}

		System.out.println("You have insufficient funds for any more transactions, your balance is " + balance);
		System.out.println("Total transaction count is "+count);
	}

}
