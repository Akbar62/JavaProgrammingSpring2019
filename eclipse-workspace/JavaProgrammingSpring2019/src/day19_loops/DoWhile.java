package day19_loops;

public class DoWhile {

	public static void main(String[] args) {

		int i = 1;

		do {
			System.out.print(i++ + " ");
		} while (i <= 10);

		int sum = 0;
		int j = 1;

		do {
			sum = sum + j;
			//System.out.println();
			j++;
		} while (j <= 5);

		System.out.println("\nSum from 1 to 5 is " + sum);
	}

}
