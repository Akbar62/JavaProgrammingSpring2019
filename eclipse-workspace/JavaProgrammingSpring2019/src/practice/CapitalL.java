package practice;

public class CapitalL {

	public static void main(String[] args) {
		System.out.println(capitalize("kAker"));
	}

	public static String capitalize(String word) {

//		String result = "";
//		String lowercase = "";
//		result = word.substring(0, 1).toUpperCase();
//		for (int i = 1; i < word.length(); i++) {
//			char chary = word.charAt(i);
//			lowercase += "" + chary;
//		}
//
//		return result + lowercase.toLowerCase();
		
		return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	}

}
