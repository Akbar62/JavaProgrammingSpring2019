package oca_practice_questions;

public class Q140 {
	public static void main(String[] args) {
		int wd = 0;
		String[] days = {"sun" , "mon" , "wed" , "sun"};
		for(String s: days) {
			switch(s) {
			case "sat":
			case "sun":
				wd -= 1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd += 2;
			}
		}
		
		System.out.println(wd);
	}

}
