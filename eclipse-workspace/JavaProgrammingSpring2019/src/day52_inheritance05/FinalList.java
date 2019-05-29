package day52_inheritance05;
import java.util.*;

public class FinalList {
	
	public static final String COLOR = "Pink";
	
	public static void main(String[] args) {
		// you can do whatever with the values as long you don't create another object
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("orange");
		COLORS.add("gray");
		COLORS.add("white");
		COLORS.add("blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("black");
		System.out.println(COLORS.toString());
		
//		COLORS = new ArrayList<>();
//		System.out.println(COLORS.toString());
//		COLORS.add("yellow");
	}

}
