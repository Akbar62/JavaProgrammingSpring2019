package day27_arrays05;

import java.util.*;

public class Times {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] time1 = { scan.nextInt(), scan.nextInt() };
		int[] time2 = { scan.nextInt(), scan.nextInt() };

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time 1 has an invalid hour");
			return;
		}

		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time 1 has invalid minutes");
			return;

		}
		
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time 1 has an invalid hour");
			return;
		}

		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time 1 has invalid minutes");
			return;
		}
		
		
		
		if ((time1[0] + time1[1]) > (time2[0] + time2[1])) {
			System.out.println("Time 2 is earlier");
		} else if ((time1[0] + time1[1]) < (time2[0] + time2[1])) {
			System.out.println("Time 1 is earlier");
		} else if ((time1[0] + time1[1]) == (time2[0] + time2[1])) {
			System.out.println("equal times");
		}

	}

}
