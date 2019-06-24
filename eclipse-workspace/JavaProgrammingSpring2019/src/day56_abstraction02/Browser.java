package day56_abstraction02;

public abstract class Browser {
	
	String name;
	static int id;
	
	public Browser() {
		System.out.println("Creating a browser");
	}
	
	public Browser(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract void navigate(String url);

	public abstract void displayWebpage();

	public abstract boolean launch();

	// we can add non-abstract methods to an abstract class
	public void close() {
		System.out.println("Exiting the browser");
	}

}
