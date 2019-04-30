package day18_while_dowhile_loops;

public class Staircase {

	public static void main(String[] args) {
		
		String stairs= "*";
		
		while(stairs.length() <= 20) {
			System.out.println(stairs);
			stairs = stairs + "*";
			
		}
	}

}
