package day14_string_methods;

public class CharAt {

	public static void main(String[] args) {
		String word = "Computer";
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		String word2 = "Java";
		if(word2.charAt(0) == 'J') {
			System.out.println("J is the first char");
		} else {
			System.out.println("J is not the first char");
		}
		
		String word3 = "Akbar";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if(first == last) { 
			System.out.println("First and last match");
		} else {
			System.out.println("First and last are different");
		}
		
		String word4 = "jkasdnfklsnvikniweni";
		char lastChar = word4.charAt( word4.length()-1);
		
		System.out.println("The last character is "+lastChar);
		
		
	}

}
