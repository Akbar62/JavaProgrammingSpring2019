package oca_practice_questions;

import java.util.*;

public class Q33 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if(names.remove("Bran")) {
			names.remove("Jon");
		}
		
		System.out.println(names);

	}

}
