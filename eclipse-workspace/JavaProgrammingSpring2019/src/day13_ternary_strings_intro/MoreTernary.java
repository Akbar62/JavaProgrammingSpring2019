package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		
		String quality = "bad";
		int rating = (quality.contentEquals("good")) ? 100: 0;
		System.out.println("Rating; "+rating);
		
		int PMHour = 6;
		//Rush hour driving evening: 4 - 7
		boolean rushHour = PMHour >= 4 && PMHour <=7 ? true : false;
		
		String result = rushHour == true ? "yes" : "no";
		System.out.println("Is it rush hour? "+result);
		
		int AMHour = 8; //6 - 9
		
		String amRushHour = AMHour >= 6 && AMHour <=9 ? "Yes" : "No";
		System.out.println(AMHour + " is rush hour? - "+amRushHour);
		
		
		
	}

}
