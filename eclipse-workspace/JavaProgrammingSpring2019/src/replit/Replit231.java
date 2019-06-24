package replit;

public class Replit231 {
	
	public static String reverseVowels(String str) {
		
		// vowels in the alphabet A, E, I, O,
		// getting a reverse of all vowels first
		// then another loop
		
		String vowels = "aeio";
		String rev1 = "";
		String rev2 = "";
		int counter = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'a' ||
					str.charAt(i) == 'E' || str.charAt(i) == 'e'||
						str.charAt(i) == 'I' || str.charAt(i) == 'i' ||
							str.charAt(i) == 'O' || str.charAt(i) == 'o') {
				rev1 += "" + str.charAt(i);
			}
		}
		
		for(int j = 0; j <= str.length() - 1; j++) {
			if (str.charAt(j) == 'A' || str.charAt(j) == 'a' ||
					str.charAt(j) == 'E' || str.charAt(j) == 'e'||
						str.charAt(j) == 'I' || str.charAt(j) == 'i' ||
							str.charAt(j) == 'O' || str.charAt(j) == 'o') {
				rev2 += rev1.charAt(counter);
				counter++;
			} else {
				rev2 += str.charAt(j);
			}
		}
		

		return rev2;

	}

	public static void main(String[] args) {
		System.out.println(reverseVowels("apple"));
	}

}
