package day22_loops_practice;

public class LookForWordInString {

	public static void main(String[] args) {
		
		String sentence = "He said hi, then she replied hi. hi guys!";
		//Print letters in pairs
		int count = 0;
		for(int i = 0; i <= sentence.length()-2;i++) {
			String temp =sentence.substring(i, i+2);
			System.out.println(temp);
			if(temp.contentEquals("hi")) {
				count++;
			}
		}
		
		System.out.println("The total count is: "+count);

	}

}
