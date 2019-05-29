package replit;

import java.util.*;

public class Replit216 {
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i) != n) {
				arr.add(r.get(i));
			}
		}
		ArrayList<Integer> ab = new ArrayList<>();
		ab.add(n);
		arr.removeAll(ab);
		// arr.addAll(r);
		// for(int i = 0; i < arr.size(); i++) {
		// if(arr.get(i) == n) {
		// arr.remove(arr.get(i));
		// }
		// }
		return arr;

	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3, 1, 1 };
		arr.addAll(Arrays.asList(nums));

		System.out.print(removeInst(arr, 1));

	}// end main

}
