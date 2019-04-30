package day23_loops_and_arrays;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		for(int j = 10; j >= 1; j--) {
			for(int i = 1; i <= j; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
