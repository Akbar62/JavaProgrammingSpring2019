package replit;

import java.util.*;

public class Replit150 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion("11:04:47PM");
		// timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String time = "";

		if (s.startsWith("1") && s.contains("PM")) {
			time = "13" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("2") && s.contains("PM")) {
			time = "14" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("3") && s.contains("PM")) {
			time = "15" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("4") && s.contains("PM")) {
			time = "16" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("5") && s.contains("PM")) {
			time = "17" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("6") && s.contains("PM")) {
			time = "18" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("7") && s.contains("PM")) {
			time = "19" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("8") && s.contains("PM")) {
			time = "20" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("9") && s.contains("PM")) {
			time = "21" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("10") && s.contains("PM")) {
			time = "22" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("11") && s.contains("PM")) {
			time = "23" + s.substring(1, s.length() - 2);
		} else if (s.startsWith("12") && s.contains("AM")) {
			time = "24" + s.substring(1, s.length() - 2);
		} 
		
		
		System.out.println(time);

	}

}
