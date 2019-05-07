package day39;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);
		printList(nums);
		System.out.println();

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.80);
		System.out.println(sumList(doubleList));
		System.out.println();

		ArrayList<Integer> ints = new ArrayList<>(getList(5));
		System.out.println(ints);

		System.out.println(getRandomList(20));

		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("53");
		strNums.add("1");
		strNums.add("47");

		convertToIntList(strNums);
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);

	}

	public static void printList(ArrayList<Integer> ints) {

		for (Integer num : ints) {
			System.out.print(num + " ");
		}

	}

	public static double sumList(List<Double> list) {

		double sum = 0;
		for (double dub : list) {
			sum += dub;
		}
		return sum;

	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> nums = new ArrayList<>(size);

		for (int i = 1; i < size; i++) {
			nums.add(i);
		}
		return nums;

	}

	public static List<Integer> getRandomList(int size) {

		Random r = new Random();
		List<Integer> randomNums = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			randomNums.add(r.nextInt(100));
		}
		return randomNums;

	}

	public static List<Integer> convertToIntList(List<String> str) {

		List<Integer> nums2 = new ArrayList<>();

		for (String word : str) {
			nums2.add(Integer.parseInt(word));
		}

		return nums2;

	}

}
