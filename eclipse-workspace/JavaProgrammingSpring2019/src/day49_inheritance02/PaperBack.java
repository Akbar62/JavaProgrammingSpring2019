package day49_inheritance02;

public class PaperBack extends Book {
	private int pages;
	
	public String toString() {
		// title, author, price, type
		return getTitle() + " | " + getAuthor() + " | " + getPrice() + " | " + getType();
	}
	

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
