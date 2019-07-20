package oca_practice_questions;

public class Q78 {
	public static void main(String[] args) {
		Caller c = new Caller();
		//c.init();
		//c.start();
	}
	
	

}

class Caller {
	private void init() {
		System.out.println("Initialized");
	}
	
	private void start() {
		init();
		System.out.println("Started");
	}
}
