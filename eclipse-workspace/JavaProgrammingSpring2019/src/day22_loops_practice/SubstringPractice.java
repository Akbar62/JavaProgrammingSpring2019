package day22_loops_practice;

public class SubstringPractice {

	public static void main(String[] args) {

		String word = "java";

		System.out.println(word.substring(0, 2));
		System.out.println();

		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
		System.out.println(word.substring(3, 4));

		System.out.println("##################");
		int i = 0;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;

		System.out.println("#####################");
		// String word2 = "";

		for (int e = 0; e <= 3; e++) {
			System.out.println(word.substring(e, e + 1));
		}

		// System.out.println(word2);

		System.out.println("######################");

		for (int a = 3; a >= 0; a--) {
			System.out.println(word.substring(a, a + 1));
		}
		
		int start = 0;
		int end = 12;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start,end));
		
		
	}

}
