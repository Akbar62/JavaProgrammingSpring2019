package day15_string_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "github";
		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("The position of the '.' is "+index);
		System.out.println(url.charAt(index+1));
		
		String title = "Java - Google Search";
		int position = title.indexOf("-");
		System.out.println(title.charAt(position-2));
		System.out.println(title.charAt(position+2));
		
		String country = "United States of America";
		int country1 = country.indexOf("States");
		System.out.println("Position of states: "+country1);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
		
		//int lan = word2.indexOf("c++");
		if(word2.indexOf("c++") !=1) {
			System.out.println("c++ is there");
		}
		
		
	}
	

}
