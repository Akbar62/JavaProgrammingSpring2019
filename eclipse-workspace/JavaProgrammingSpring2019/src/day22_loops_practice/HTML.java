package day22_loops_practice;
import java.util.*;
public class HTML {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    String index = html.substring(html.indexOf("id="),html.indexOf("\">"));
	    
	    if(html.contains(index)) {
	      System.out.println(index.substring(4));
	    } else {
	      System.out.println("Invalid input!");
	    }

	}

	
	}


