package review_vasyl6;

public class StringPractice3 {
	public static void main(String[] args) {
		String target = "!apple-";
		String expected = "!eppla-";
		System.out.println(reverseLetters(target));

	}

	public static String reverseLetters(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			while (!Character.isLetter(arr[i])) {
				i++;
			}
			while (!Character.isLetter(arr[j])) {
				j--;
			}
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		String result = new String(arr);
		return result;
	}
}
