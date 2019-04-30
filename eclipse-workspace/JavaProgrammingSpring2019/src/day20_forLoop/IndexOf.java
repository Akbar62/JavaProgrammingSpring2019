package day20_forLoop;

public class IndexOf {

	public static void main(String[] args) {
		
		String word = "Amazon";
		char letter = 'm';
		int index = 0;
		
		for(int i = 0; i < word.length();i++) {
			if(word.charAt(i)==letter) {
				index = i;
				break;
			}
			
			
		}
		
			System.out.println("Index: "+index);
		
	}

}
