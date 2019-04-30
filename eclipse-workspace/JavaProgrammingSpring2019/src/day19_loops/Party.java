package day19_loops;
import java.util.*;
public class Party {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String guest = "";
	    String newGuest = "";
	    String answer = "";
	    //String yesOrNo2 = "";
	    String guestList = "";
	    
	   System.out.println("Please enter guest name:");
	    guest = input.nextLine();
	    
	   System.out.println("Do you want to enter new guest name:");
	    answer = input.nextLine();
	    
	    
	    while (answer.equalsIgnoreCase("yes")) {
	    System.out.println("Please enter guest name:");
	    newGuest = input.nextLine();
	    
	    System.out.println("Do you want to enter new guest name:");
	    answer = input.nextLine();
	    if(guestList.contentEquals("")) {
	    	guestList = guestList+newGuest;
	    }else {
	    	
	   // if(yesOrNo2.equalsIgnoreCase("no")) {
	     // guestList = guest +", "+ newGuest;
	     // System.out.println("Guest's list: "+guestList);
	      
	    }
	   
	    }
    	guestList = guestList +", "+ newGuest;

	    System.out.println("Guest's list: "+guestList);
	}

}
