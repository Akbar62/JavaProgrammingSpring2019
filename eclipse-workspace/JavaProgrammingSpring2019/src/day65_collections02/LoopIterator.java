package day65_collections02;
import java.util.*;

public class LoopIterator {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(750);
		nums.add(90);
		nums.add(5330);
		nums.add(1150);
		nums.add(50666);
		nums.add(950);
		
		// create iterator object
		Iterator<Integer> it = nums.iterator();
		
		// call hasNext method
		/*
		 * hasNext returns true, if there is still a next value
		 * returns false when it reaches the end or if its empty
		 */
		System.out.println("it hasNext() - " + it.hasNext());
		System.out.println("it.next() - > " + it.next());
		System.out.println("it.next() - > " + it.next());
		
		// use a while loop
		while(it.hasNext()) {
			System.out.println(it.next() + " | ");
		}
		System.out.println();
		
		//System.out.println(it.next());  noSuchElementException
		Iterator<Integer> it2 = nums.iterator();
		/*
		 * when using Iterator to loop through a collection,
		 * we can remove objects while looping
		 * 
		 */
		while(it2.hasNext()) {
			int val = it2.next();
			if(val > 1000) {
				it2.remove();
			}
		}
		
		System.out.println(nums.toString());
		
//		for(int num : nums) {
//			if( num > 400) {
//				nums.remove(new Integer(num));
//			}
//		}
		
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Boston");
		cities.add("Vienna");
		cities.add("Sterling");
		
		// ConcurrentModificationException
		
//		for(String city : cities) {
//			if(city.equals("Boston")) {
//				cities.remove(city);
//			}
//		}
		
		
		
		
	}

}
