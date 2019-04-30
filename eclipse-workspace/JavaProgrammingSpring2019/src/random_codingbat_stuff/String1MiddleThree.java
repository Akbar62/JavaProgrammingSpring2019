package random_codingbat_stuff;

public class String1MiddleThree {

	public static void main(String[] args) {
		String str = "solving";
		
		if(str.length() % 2 != 0) {
			System.out.println(str.substring(str.length() / 2-1, str.length() / 2+2));
			//System.out.println(str.substring(str.length()/2));
			//return (str.substring(str.length() / 2-1, str.length() / 2+2);
		}
		
	}

}
