package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		if(list.contains("apples")) {
			System.out.println("Apples are there");
		} else {
			System.out.println("lets add apples now!");
		}
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: "+hasEggs);
		
		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumbers: "+hasCucumbers);
		
		email = "name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("Yahoo account");
		} else if(email.contains("gmail")) {
			System.out.println("Gmail account");
		} else if(email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		} else {
			System.out.println("Pipe is not detected");
		}
		
		String name = "Akbar";
		if(name.contains("a") || name.contains("e")) {
			System.out.println("Your name contains an 'e' or an 'a'");
		} else {
			System.out.println("Your name does not contain an 'a' or an 'e'");
		}
		
		String str = " | ";
		System.out.println(etsyTitle.contains(str)); 
		
		
	}

}
