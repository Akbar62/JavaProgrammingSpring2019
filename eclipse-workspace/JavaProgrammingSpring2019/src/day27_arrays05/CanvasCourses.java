package day27_arrays05;

import java.util.Arrays;

public class CanvasCourses {

	public static void main(String[] args) {

		String url = "https://learn.cybertekschool.com/courses/149";
		String[] ursl = url.split("/");
		
		System.out.println(ursl[4]);
		
		//String num = ursl[4];
		int num = Integer.parseInt(ursl[4]);
		
		switch(num) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome kit");
			break;
			default:
				System.out.println("Invalid course ID");
		}
		
//		147 -> Java programming
//		204 -> Mentoring sessions
//		149 -> SDLC
//		152 -> QA Testing
//		144 -> Team activity
//		143 -> Welcome Kit


	}

}
