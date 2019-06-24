package replit;

public class Replit166 {

	public static String mergeStrings(String one, String two) {

		char[] char1 = one.toCharArray();
		char[] char2 = two.toCharArray();
		int length = char1.length + char2.length;
		char[] both = new char[length + 10];
		String merge = "";
		int k = 0;
		int g = 1;

		for (int i = 0; i <= char1.length - 1; i++) {
			
			both[k] = char1[i];
			k++;
			k++;
		}

		for (int i = 0; i <= char2.length - 1; i++) {
			both[g] = char2[i];
			g++;
			g++;
		}

		merge = String.valueOf(both);
		return merge;

	}
	
	public static void main(String[] args) {
		System.out.println(Replit166.mergeStrings("hello", "akbar"));
	}

}
