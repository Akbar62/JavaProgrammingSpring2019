package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {

		char letter = 'a';

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;

		}
		System.out.println();

		char capitals = 'A';

		while (capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
		}

		System.out.println();
		
		char backwards = 'z';

		while (backwards >= 'a') {
			System.out.print(backwards + " ");
			backwards--;
		}
		
		String letters = "";
		char myLetter = 'A';
		
		while(myLetter <= 'Z') {
			letters = letters+ myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
	}

}
