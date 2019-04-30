package day22_loops_practice;
import java.util.*;
public class RepeatSeparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String combined = "";
	    int counter = 0;
	    
	    while(count >= 1) {
	      combined = combined + word + separator;
	      count--;
	    }
	    
	    //combined = combined + combined;
	    System.out.println(combined.substring(0, combined.lastIndexOf(separator)));
	}

}
