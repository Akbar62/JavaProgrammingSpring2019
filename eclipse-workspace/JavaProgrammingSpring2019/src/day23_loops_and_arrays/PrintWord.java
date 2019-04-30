package day23_loops_and_arrays;

public class PrintWord {
	public static void main(String[] args) {
		String word = "java";
		for(int i = 0;i < word.length();i++) {
			//condition
			if(word.substring(i, i + 1).contentEquals("a")) {
				//if condition is true, go back to the loop body
				//update statement
				continue;
			}
			System.out.print(word.substring(i, i + 1));
			
		}
	}
}
