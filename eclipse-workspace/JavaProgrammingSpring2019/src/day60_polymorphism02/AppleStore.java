package day60_polymorphism02;

public class AppleStore {
	public static void main(String[] args) {
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code();
		// code method is not visible
		// only AppleDevice methods can be called
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice watch = new AppleWatch();
		watch.use();
		//watch.wear();
		// not going to compile
		
	}

}
