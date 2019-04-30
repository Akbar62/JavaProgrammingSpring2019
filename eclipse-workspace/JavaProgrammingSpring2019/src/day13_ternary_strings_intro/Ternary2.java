package day13_ternary_strings_intro;
import java.util.*;

class Ternary2 {
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
		String result = "";
		result = x>=5 ? "x" : "-x";
		result = x<5 ? "-x" : "x";
		System.out.println(result);	
	  }
	}