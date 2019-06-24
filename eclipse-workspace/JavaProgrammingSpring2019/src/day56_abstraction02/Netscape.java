package day56_abstraction02;

public class Netscape extends Browser {

	@Override
	public void navigate(String url) {
		System.out.println("Netscape - navigating to " + url);
	}

	@Override
	public void displayWebpage() {
		System.out.println("Netscape - displaying webpage");
	}

	@Override
	public boolean launch() {
		System.out.println("Netscape is launching");
		System.out.println("1, 2, 3");
		return true;
	}
	
	@Override
	public void close() {
		super.close(); // you can call the super method from the parent class
		System.out.println("Exiting netscape");
	}

}
