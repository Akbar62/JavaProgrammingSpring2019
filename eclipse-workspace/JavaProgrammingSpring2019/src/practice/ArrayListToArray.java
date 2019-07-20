package practice;

import java.util.*;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		//Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);
		// the size 0 for the parameter indicates that Java will create
		// a new array of the proper size for the return value
		System.out.println(stringArray.length);
	}

}
