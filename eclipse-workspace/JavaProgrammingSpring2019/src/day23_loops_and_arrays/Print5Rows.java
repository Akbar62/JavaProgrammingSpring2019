package day23_loops_and_arrays;

public class Print5Rows {

	public static void main(String[] args) {

		String str = "";
		for (int i = 0; i < 10; i++) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);
			}
			System.out.println();
			System.out.println("**************************");
		}
	}

}
