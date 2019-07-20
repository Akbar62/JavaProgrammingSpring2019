package day65_collections02;
import java.util.*;

public class LoopArrayList1 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(90);
		nums.add(5330);
		nums.add(1150);
		nums.add(50666);
		nums.add(950);
		
		// loop using a for each loop
		for(int num: nums) {
			System.out.print(num + " | ");
		}
		System.out.println();
		
		// loop using a for loop
		for(int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " | ");
		}
		System.out.println();
		
		
		/* for each method of java 8
		 for each comes from the Iterable interface
		 we need to pass a lambda expression
		 lambda is part of Java functional programming that started with java 8
		 used to pass an implementation while programming
		 we need to use -> operator
		 * 
		 * 
		 */
		
		nums.forEach(number -> System.out.print(number + " | "));
		
		System.out.println();
		
		nums.removeIf(n -> n < 500);
		
		nums.forEach(n -> System.out.print(n + " | "));
		
		//nums.stream() can also be used to manipulate data in collections
		
		
		/* all actions that Java functional programming can do can also
		 be achieved using traditional for and for each loops
		 functional programming is only used for shorter code and 
		 faster programming
		 in general functional programming is slower than traditional
		 * 
		 */
	}

}
