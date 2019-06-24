package review_vasyl6;

public class StringPractice {
	public static void main(String[] args) {
		String target = "apple";
		String expected = "elppa";
		String actual = reverse(target);
		String actual2 = new StringBuilder(target).reverse().toString();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected result: " + expected);
			System.out.println("Actual result: " + actual);
		}
		
		
	}

	private static String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += "" + str.charAt(i);
		}
		return result;
	}

	private static String reverse2(String str) {
		char[] arr = str.toCharArray();
		String result2 = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result2 += "" + arr[i];
		}

		return result2;
	}

}
