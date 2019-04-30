package day24_arrays;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
//		binary search only works with sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 90);
		System.out.println("Position: "+index);
		
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println("Position: "+index2);
		
		
		

	}

}
