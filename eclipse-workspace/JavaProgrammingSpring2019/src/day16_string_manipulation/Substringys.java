package day16_string_manipulation;

public class Substringys {

	public static void main(String[] args) {
		
		String sentence = "I wrote [33] lines of code";
		int start = sentence.indexOf('[')+1;
		int end = sentence.lastIndexOf(']');
		
		String codeCount = sentence.substring(start, end);
		
		System.out.println("I wrote "+codeCount+" lines of code today"); 
		
		int count = Integer.parseInt(codeCount);
		if(count > 20) {
			System.out.println("Wrote more than 20 lines of code today");
		} else {
			System.out.println("Not enough coding for today");
		}
		
		String word2 = "Coffee cup for sale";
		String wordy =word2.substring(7);
		System.out.println(wordy);
		
		
		String word = "java";
		System.out.println(word.replace("j", "c"));
		
	}

}
