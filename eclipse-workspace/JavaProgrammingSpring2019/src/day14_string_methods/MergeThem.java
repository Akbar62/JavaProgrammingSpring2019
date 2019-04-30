package day14_string_methods;
import java.util.*;
public class MergeThem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String word1 = scan.next();
		    String word2 = scan.next();
		    
		    int word1Length = word1.length();
		    int word2Length = word2.length();
		    
		    if(word1Length != 3 || word2Length != 3) {
		      System.out.println("cannot merge");
		    } else if (word1Length == 3 && word2Length == 3) {
		      System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2)+"");
		    }

	}

}
