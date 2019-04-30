package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		
		String word = "Amazon";
		//System.out.println(word.charAt(0)+"\n"+word.charAt(1)+"\n"+word.charAt(2)+"\n"+word.charAt(3)+"\n"+word.charAt(4)+"\n"+word.charAt(5));
		
		int idx = 0;
		while(idx < word.length()) {
			System.out.println(word.charAt(idx));
			idx++;
			
		}
		
		int idx2 = word.length()-1;
		while(idx2 >= 0) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
	}

}
