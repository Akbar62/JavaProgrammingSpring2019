import java.util.*;

	public class Caffeine {
		public static void main(String[] args) {
			
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter numer of milligrams in drink:");
	    int milligramsInDrink = scan.nextInt();
	    int lethalOverdose = (milligramsInDrink / 10000);
	    System.out.println("It would take about "+lethalOverdose+" drinks for a lethal overdose.");
	    
	}
}
