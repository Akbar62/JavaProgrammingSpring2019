package practice;

public class Replit7_1 {
	
	public static void main(String[] args) {
		
		System.out.println(makeThreeSubstr("Akbar", 2, 4));
	}
	
	public static String makeThreeSubstr(String word, int start, int end) {
		
		String finalWord = word.substring(start, end);
		finalWord+= word.substring(start, end);
		finalWord+= word.substring(start, end);
		
		
		return finalWord;
	}

}
