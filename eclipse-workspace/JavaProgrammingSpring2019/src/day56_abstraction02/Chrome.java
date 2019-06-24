package day56_abstraction02;

public class Chrome extends Browser {

	public Chrome(String name, int id) {
		super(name, id);
	}

	@Override
	public void navigate(String url) {

	}

	@Override
	public void displayWebpage() {

	}

	@Override
	public boolean launch() {
		return false;
	}

}
