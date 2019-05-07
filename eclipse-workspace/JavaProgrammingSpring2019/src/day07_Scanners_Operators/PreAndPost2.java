package day07_Scanners_Operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		int messages = 10;
		messages++;
		++messages;
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages;
		System.out.println("Read Messages: " + readMessages);
		System.out.println("Messages: " + messages);
		
		int unreadMessages = readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: " + readMessages);
		
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("Unread Messages: " + unreadMessages);
		System.out.println("Read Messages: " + readMessages);
		System.out.println("Total: " + total);
		
		int count = 20;
		int count2 = 10;
		
		int totalCount = ++count + --count2;
		System.out.println("Count: " + count);
		System.out.println("Count2: " + count2);
		System.out.println("Total Count: " + totalCount);
		
		int myCount = count++ + ++count;
		
		System.out.println("Count: " + count);
		System.out.println("My Count: " + myCount);
	}

}
