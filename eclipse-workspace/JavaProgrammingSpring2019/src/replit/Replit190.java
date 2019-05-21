package replit;

import java.util.*;

public class Replit190 {
	public static void main(String[] args) {

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> ints) {
		ArrayList<Integer> b = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < ints.size(); i++) {
			if (ints.get(i) >= 0) {
				b.add(i);
				sum += i;
			}
		}
		b.add(sum);
		return b;
	}

}
