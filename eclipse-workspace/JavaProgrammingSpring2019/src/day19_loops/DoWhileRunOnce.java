package day19_loops;

public class DoWhileRunOnce {

	public static void main(String[] args) {
		
		// In this example the do while loop runs once then tests the condition and exits the loop
		//The condition is false
		int count = 10;
		
		do {
			System.out.println("Count: " + count);
			count++;
		}while(count <= 5);
	}

}
