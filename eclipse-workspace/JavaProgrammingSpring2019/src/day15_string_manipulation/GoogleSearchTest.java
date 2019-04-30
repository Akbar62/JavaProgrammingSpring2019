package day15_string_manipulation;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item = "java";
		String pageTitle = item + " - Google Search";
		
		if(pageTitle.startsWith(item)) {
			System.out.println("PASS: Page title check passed");
		} else {
			System.out.println("FAIL: Page title check failed");
		}
		
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Page title check passed");
		} else {
			System.out.println("FAIL: Page title check passed");
		}
	}

}
