package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "you are a very interesting person";
		// split by space

		String[] str = sentence.split(" ");
		System.out.println("Number of words: " + str.length);
		System.out.println(Arrays.toString(str));
		
		String reversed = "";
		
		for(int i = str.length-1; i >= 0; i--) {
			System.out.println(str[i]);
			reversed = reversed + str[i] + " ";
		}
		
		System.out.println(reversed);
	}

}
