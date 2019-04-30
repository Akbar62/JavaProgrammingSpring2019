package day35_methods07;

public class EncryptionFunV2 {

	public static void main(String[] args) {
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));

		String normal = "html";
		String encrypted = encryptWord(normal);
		System.out.println("normal: " + normal + "\n" + "encrypted: " + encrypted);
		String sentence = "qadef wfjnfjen ewifnkewfn efiee";
		System.out.println(encryptSentence(sentence));

	}

	/*
	 * encryptChar return type: char param: char takes a char and returns encrupted
	 * version encryptChar('b') ==> 'y'
	 */
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		// return encrypted.charAt( alphabet.indexOf(ch) );
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}

	/*
	 * encryptWord return type: String param: String take a string and returns
	 * encrypted version for the whole word
	 */
	public static String encryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;
	}
	
	public static String encryptSentence(String sentence) {
		
		String[] wordArr = sentence.toLowerCase().split(" ");
		String returnVal = "";
		
		for(String str: wordArr) {
			returnVal = encryptWord(str)+" ";
		}
		return returnVal.trim();
	}

}
