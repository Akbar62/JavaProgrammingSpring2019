package practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "akbar";
		String reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i)+"";
		}
		
		System.out.println(reverse);
		
//		String ak = str.substring(0, 1).toUpperCase();
//		System.out.println(ak);
	}

}
