package day22_loops_practice;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		String word = "including webpages, images";
		//find out how many 'e' characters are in the word
		//Get the length of word
		//Replace all 'e's with empty
		//Get the length of word e without e
		//Do a minus
		
		int length1 = word.length();
		word = word.replace("e", "");
		int length2 = word.length();
		
		System.out.println("Length1: "+length1);
		System.out.println("Length2: "+length2);
		
		int count = length1 - length2;
		System.out.println("Count: "+count);
		
		
				
	}

}
