package day38_arraylist03;
import java.time.Month;
import java.util.*;

public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1; // list1, list2 point to the same object
		// copy all values from list1
		ArrayList<String> month = new ArrayList<>(list1);
		System.out.println(month);
		month.add("Jun");
		month.add("Jul");
		month.add("Aug");
		System.out.println(month);
		System.out.println(month.contains("Jan"));
		System.out.println(month.contains("Dec"));
		System.out.println(month.contains("Jun"));
		// how to check if Feb is in the second position
		// months.clear()
		System.out.println(month.indexOf("Feb") == 1);
		System.out.println(month.get(1).contentEquals("Feb"));
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		
		System.out.println("Month: " + month.toString());
		System.out.println("Month2: "+ month.toString());
		
		// check if month has all the values of Month2
		if(month.containsAll(month2)) {
			System.out.println("Month has all the moneths of month2");
		} else {
			System.out.println("Some values are missing");
		}
		
		// add one Jan to month2
		month2.add("Jan");
		
		
		
	}
	
	

}
