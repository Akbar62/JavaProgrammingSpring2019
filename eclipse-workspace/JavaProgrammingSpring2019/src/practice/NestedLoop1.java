package practice;

public class NestedLoop1 {
	public static void main(String[] args) {
		
		//int ak = 1;
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Outside the loop");
		
		

	}

}
