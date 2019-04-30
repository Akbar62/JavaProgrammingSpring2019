package replit;

import java.util.*;

public class Replit124 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		
//		String splitter = Arrays.toString(num);
//		System.out.println(splitter);
		
		int[] nums = new int[num.length];
		
		if(num.length < 2) {
			nums = Arrays.copyOf(num, num.length);
			System.out.println(Arrays.toString(nums));
			//System.out.println(Arrays.copyOf(num, 2));
		}else if(num.length > 2) {
			nums = Arrays.copyOf(num, 2);
			System.out.println(Arrays.toString(nums));
		}
		

	}
}
