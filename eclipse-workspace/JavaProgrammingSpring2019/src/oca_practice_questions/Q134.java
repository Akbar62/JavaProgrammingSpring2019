package oca_practice_questions;

public class Q134 {
	public static void main(String[] args) {
		int nums1[] = {1,2,3};
		int nums2[] = {1,2,3,4,5};
		
		nums2 = nums1;
		
//		System.out.println(nums1[0]);
//		System.out.println(nums1[1]);
//		System.out.println(nums1[2]);
//		System.out.println(nums1[3]);
//		System.out.println(nums1[4]);
		
		for(int num : nums2) {
			System.out.print(num + ":");
		}
	}

}
