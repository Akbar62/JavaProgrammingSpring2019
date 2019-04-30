package day14_string_methods;
import java.util.*;
public class MiddleOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int wordLength = word.length();
	    
	    if(wordLength % 2 != 0) {
	    	if (wordLength >= 3) {
	    		char middleOne = word.charAt( word.length()/2);
	    		System.out.println(middleOne);	
	    	}else if(wordLength % 2 != 0) {
	    		if(wordLength == 1) {
	    			System.out.println(word.charAt(0)+""+word.charAt(0)+""+word.charAt(0));
	    	
	    		
	    	
	    	} else if (wordLength % 2 ==0 && wordLength >= 4) {
	    	char middleTwo = word.charAt(word.length()/2);
	    	System.out.println(middleTwo);
	    }else if (wordLength == 2) {
	    		System.out.println(word.charAt(0)+""+word.charAt(1));
	    		
	    	}
	    	
	    	
	 

	    	}
	    }
	}
}
