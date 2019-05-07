package day36_wrapperclasses_arraylistIntro;
import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		// Create an array list
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		// assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		
		nums.add(100);
		nums.add(99);
		nums.add(656);
		nums.add(8566);
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
	}

}
