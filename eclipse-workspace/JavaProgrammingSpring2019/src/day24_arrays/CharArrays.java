package day24_arrays;

public class CharArrays {

	public static void main(String[] args) {

		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}

		String str = "Wooden spoon";

		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c);
		}
		for (int i = chars.length - 1; i >= 0; i--) {
			str+=chars[i];
		}
		
		System.out.println(str);
		
		for(char c: chars) {
			if(c == 'o') {
				System.out.println("*");
			} else {
				System.out.println(c);
			}
		}

	}

}
