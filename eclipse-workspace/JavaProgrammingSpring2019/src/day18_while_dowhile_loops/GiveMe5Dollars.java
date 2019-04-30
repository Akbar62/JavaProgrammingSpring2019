package day18_while_dowhile_loops;
import java.util.*;
public class GiveMe5Dollars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dollars = 0;
		
		while(dollars != 5) {
			System.out.println("Give me 5 bucks");
			dollars = scan.nextInt();
		}
		
		System.out.println("Good looks");
	}

}
