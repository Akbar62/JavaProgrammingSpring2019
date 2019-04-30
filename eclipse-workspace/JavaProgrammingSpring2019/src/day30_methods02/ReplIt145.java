package day30_methods02;

import java.util.*;

public class ReplIt145 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		plus_minus(arr);
	}// end main

	public static void plus_minus(int[] arr) {

		int positives = 0;
		int negatives = 0;
		int zeroes = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positives++;
			} else if (arr[i] < 0) {
				negatives++;
			} else if (arr[i] == 0) {
				zeroes++;
			}
		}
		
		System.out.println("positives:"+positives+", negatives:"+negatives+", zeroes:"+zeroes);
	}

}
