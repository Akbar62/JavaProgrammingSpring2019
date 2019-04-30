package day15_string_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "eclipse";
		//Tests if string starts with another string
		
		System.out.println(word1.startsWith("e")); //true
		System.out.println(word1.startsWith("ec")); //true
		System.out.println(word1.startsWith("ecli")); //true
		
		System.out.println(word1.startsWith("Ec")); //false
		
		System.out.println(word1.endsWith("e")); //true
		
		System.out.println(word1.endsWith("ipse")); //true
		System.out.println(word1.endsWith("java")); //false
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		System.out.println();
		
		String word2 = "Mr. Jackson";
		//Mr. Mrs. Ms. 
		
		if(word2.startsWith("Mr.")) {
			System.out.println("man");
		} else if (word2.startsWith("Mrs.")) {
			System.out.println("married woman");
		} else if (word2.startsWith("Ms.")) {
			System.out.println("some woman");
		} else if (word2.startsWith("Dr.")) {
			System.out.println("doctor male or female");
		} else if (word2.startsWith("")) {
			System.out.println("unknown status");
		}
	}

}
