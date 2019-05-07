package day38_arraylist03;

import java.util.*;

public class MethodsSummary {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		// add method with index: yellow will be the first value
		// Everything thing else shifts to the right
		list1.add(0, "yellow");
		// toString() method is to print all values in the same line
		System.out.println(list1.toString());
		// size method
		System.out.println("Number of elements: " + list1.size());
		// get method returns a value from an index
		System.out.println(list1.get(3));
		System.out.println(list1.get(0));
		// remove using index, removes the value from that index
		list1.remove(0);
		System.out.println(list1.toString());
		// remove using a value/element. removes first occurence of an element
		list1.remove("blue");
		System.out.println(list1.toString());
		// set(index, value) replace a certain index with a new value
		list1.set(0, "orange");
		System.out.println(list1.toString());
		// indexOf(value) returns index of value in the list
		System.out.println("grey: "+list1.indexOf("grey"));
		System.out.println("green: "+list1.indexOf("green"));
		// isEmpty() returns true if the list is empty. size == 0
		System.out.println("Is list empty? "+list1.isEmpty());
		System.out.println("Is list empty? "+(list1.size() == 0));
		// contains(element) returns true is value is present
		System.out.println("Is white in the list? "+list1.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		// add all --> adds all values from one list into another
		list2.addAll(list1);
		System.out.println(list2);
		// contains all checks if a list has all the values of another list
		System.out.println(list1.containsAll(list2));
		// equals(list) checks if 2 lists are exactly equal
		System.out.println(list2.equals(list1));
		
		list2.add("pink");
		// remove all(list) removes all matching value from your list that are in
		// the other list
		list2.removeAll(list1);
		System.out.println("list2 after removeAll: "+list2);
		System.out.println("list1: "+list1);
		
		// addAll(index, list) adds new list values starting from a certain given index
		list2.addAll(0, list1);
		System.out.println(list2);
		
		// clears all values from the list
		list1.clear();
		list2.clear();
		System.out.println("both empty? "+(list1.isEmpty() && list2.isEmpty()));
		
	}

}
