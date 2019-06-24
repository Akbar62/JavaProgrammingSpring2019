package officehours18_11june;

public class Party {
	public static void main(String[] args) {
		// on the left side we put the interface
		// on the right we put the class
		Person john = new Engineer();
		
		PartyTopics topic = new PartyTopics();
		topic.discuss(john);
		
		Person jack = new UberDriver();
		topic.discuss(jack);
		
		Person p3 = new Prince();
		topic.discuss(p3);
	}

}
