package day20_forLoop;

public class PrintEachChar {

	public static void main(String[] args) {
		String word = "Amazon";
		
		//Using a for loop print each char one by one
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter == 'a'|| letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter+ ", ");
			}
		}
		//Using a for loop, print only consonants
		//for(j = 0; j < word)
		
		
		//Using a for loop, print only vowels
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter == 'a'|| letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter+ ", ");
			}
		}
	}

}
