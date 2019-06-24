package replit;

import java.util.Arrays;

public class Replit226 {

	public static int[] generateTable(int value, int numberOfEntries) {

		int[] arr = new int[numberOfEntries];
		int counter = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = counter * value;
			counter++;
		}

		return arr;

	}

	public static boolean checkTable(int value, int[] tableToTest) {
		
		
		

		return false;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(generateTable(3, 5)));
		int[] ak = {0, 3, 6, 9};
		System.out.println((checkTable(3,ak)));

	}
	
//	int count = 1;
//	boolean isMultiple = true;
//	boolean[] check = new boolean[tableToTest.length];
//	
//	for (int i = 0; i <= tableToTest.length - 1; i++) {
//		if (tableToTest[i] % value == 0) {
//			check[i] = true;
//		}
//	}
//	
//	for(int j = 0; j <= check.length - 1; j++) {
//		if(check[j] != true) {
//			isMultiple = false;
//		}
//	}

}
