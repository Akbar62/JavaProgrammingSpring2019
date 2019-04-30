package day35_methods07;

public class DecryptionFun {

	public static void main(String[] args) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		System.out.println(decryptChar('a'));
	}

	public static char decryptChar(char chary) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		int i = encrypted.indexOf(chary);
		char ret = alphabet.charAt(i);
		return ret;
	}

}
