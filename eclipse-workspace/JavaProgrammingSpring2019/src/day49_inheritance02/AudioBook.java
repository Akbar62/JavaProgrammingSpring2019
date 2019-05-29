package day49_inheritance02;

public class AudioBook extends Book {
	private int length;
	private String narrator;
	
	public void listen() {
		// listening to Java book by savitch and narrated by Marufjon
		System.out.println("Listening " + getTitle() + " by " + getAuthor());
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getNarrator() {
		return narrator;
	}

	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}

}
