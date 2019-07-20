package replit;

import java.util.ArrayList;

public class Replit230 {

	// You need to loop through each element in the ArrayList and find the matching
	// String[] with that id.

	public static void main(String[] args) {
		Replit230 m = new Replit230();
		ArrayList<String[]> arr = new ArrayList<String[]>();
		arr.add(new String[] { "1", "title 1", "content" });
		arr.add(new String[] { "2", "title 2", "content" });
		arr.add(new String[] { "3", "title 3", "content3" });

		String post = m.blogDb(arr, "3");
		System.out.print(post);
		// should output:
		// title 3
		// content3
	}

	public String blogDb(ArrayList<String[]> r, String id) {
		String result = "";

		for (String[] arr : r) {
			for (String str : arr) {
				result += str;
			}
		}
		
		String[] arg = result.split(" ");
		ArrayList<String> arg2 = new ArrayList<>();
		
		for(int i = 0; i < arg.length; i++) {
			
		}
		
		return result;

	}

}
