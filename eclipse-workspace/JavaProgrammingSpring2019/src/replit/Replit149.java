package replit;

import java.util.*;

public class Replit149 {

//	public static void add_to_r(int[] r, int n) {
//		// create new array with one more position.
////		the method creates a new array bigger by one then (int[] r).
////		It populates the new array with the old ones(r) values.
////		and finally in the last position adds the number (int n) to it.
//		
//		int[] new_r;
//
//	}

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt(), n = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		// int[] new_r = new int[size+1];
		int a = 0;
		int[] new_r = Arrays.copyOf(arr, size + 1);
		new_r[new_r.length - 1] = n;

		add_to_r(arr, n);

	}

	public static void add_to_r(int[] arr, int n) {
		int a = 0;
		int[] new_r = Arrays.copyOf(arr, arr.length+1);
		new_r[new_r.length - 1] = n;

	}

}
