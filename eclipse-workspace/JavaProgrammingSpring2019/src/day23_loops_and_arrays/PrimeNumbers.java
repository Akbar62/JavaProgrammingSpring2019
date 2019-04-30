package day23_loops_and_arrays;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a prime number");
		int prime = scan.nextInt();
		
		for(int i = 2; i < prime;i++) {
			if(prime % i == 0) {
				System.out.println("This is a prime number");
			}
		}
		System.out.println("This is not a prime number");

	}

}
