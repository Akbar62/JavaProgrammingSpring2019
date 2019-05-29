package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		int[] nums = {42, 12, 4, 1, 3, 5};
		//toString method
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method. sorts array in ascending numerical order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic", "Uzbek"};
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		int[] nums2 = {345, 665, 3333, 11, 3, 66};
		//Find the lowest and largest values in the array
		
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int largest = nums2[ nums2.length-1];
		
		System.out.println("The lowest number is "+lowest);
		System.out.println("The largest number is "+largest);
		
		//Binary search
		//Searches for a value in the array and returns an index
		//The array must already be sorted for this to work
		
		int[] nums3 = {4, 10, 20, 50};
		Arrays.binarySearch(nums3, 10);
		
//		int[] arrz = new int[10];
//		arrz = new int [12];
		//System.out.print(c);

	}

}
