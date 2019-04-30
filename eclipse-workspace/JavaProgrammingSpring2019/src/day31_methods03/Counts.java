package day31_methods03;
import java.util.*;
public class Counts {

	public static void main(String[] args) {

		countUp(5);
		System.out.println();
		countDown(6);
		System.out.println();
		countUp(10);
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		int inputNum = scan.nextInt();
		
		countUp(inputNum);

	}

	public static void countDown(int count2) {
		if (count2 < 1) {
			System.out.println("Invalid input");
		} else {

			for (int i = count2; i > 0; i--) {
				System.out.print(i + " ");
			}

		}

	}

	public static void countUp(int count1) {
		if (count1 < 1) {
			System.out.println("Invalid input");
		} else {

			for (int i = 1; i <= count1; i++) {
				System.out.print(i + " ");
			}
		}
	}

}
