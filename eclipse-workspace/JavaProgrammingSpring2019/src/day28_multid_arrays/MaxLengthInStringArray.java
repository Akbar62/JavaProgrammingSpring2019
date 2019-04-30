package day28_multid_arrays;
import java.util.*;
public class MaxLengthInStringArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		int num = Integer.MIN_VALUE;
		String word = "";
		
		for(int i = 0; i < 5; i++) {
		  if(words[i].length()  > num ) {
		    word = words[i];
		  }
		}
		
		System.out.println(word);

	}

}
