package day36_wrapperclasses_arraylistIntro;
import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijani");
		languages.add("Ukranian");
		
		System.out.println("Number of values: "+ languages.size());
		languages.add("Turkish");
		System.out.println("Number of values: "+ languages.size());
		
		// remove java
		languages.remove(0);
		System.out.println("Number of values: "+ languages.size());
		System.out.println(languages.toString());
	}

}
