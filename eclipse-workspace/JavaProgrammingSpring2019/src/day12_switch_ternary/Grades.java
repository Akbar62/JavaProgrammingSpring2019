package day12_switch_ternary;
import java.util.*;
public class Grades {

	public static void main(String[] args) {
		System.out.println("What is your grade?");
		char grade = 'B';
		
		switch (grade) {
			case 'A':
			case 'B':
			case 'C':
			System.out.println("Pass");
			break;
			case 'D':
			case 'E':
			case 'F':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalid grade");
			
			
		}
		
		

	}

}
