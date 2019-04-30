package replit;

import java.util.*;

public class Replit121 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strArr = str.split(",");
		int minLength = strArr[0].length();
		// int index = 0;
		int counter = 0;

		for (int i = 0; i < strArr.length - 1; i++) {
			if (strArr[i].length() < minLength) {
				// index = i;
				minLength = strArr[i].length();
			}
		}

		// for(int j = 0; j < strArr.length; j++) {
		// if(strArr[j].length() == minLength) {
		// counter++;
		// }
		// }

		// String[] newArr = new String[counter];
		// int k = 0;
		String words = "";

		for (int a = 0; a < strArr.length; a++) {
			if (strArr[a].length() == minLength) {
				words += strArr[a] + "/";
				// newArr[k] = strArr[a];
				// k++;
			}
		}

		// System.out.println(words);

		String[] newArr = words.split("/");
		Arrays.sort(newArr);

		System.out.println(Arrays.toString(newArr));

	}

}
