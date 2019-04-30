package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(withNoSpace);
		
		System.out.println(sentence);
		
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		
		String mixed = "*&%&^ja-v|a*&^*&^*";
		mixed = mixed.replace("*&%&^", "");
		System.out.println(mixed);
		mixed = mixed.replace("-v|a*&^*&^*", "va");
		System.out.println(mixed);
		
		//mixed = mixed.replace().replace().replace().
		//Chaining them together
		
		String result = "About 115,000,000 results (0.59 seconds)";
		//using replace get number of results
		
		//String resultNum = result.replace("About" ,"").replace("results (0.59 seconds)", "");
		//System.out.println(resultNum);
		//Can't change the number doe
		
		result = result.replace("About ", "");
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		result = result.replace(",", "");
		System.out.println(result);
	}
}
