package day61_polymorphism03;
import day60_polymorphism02.*;

public class Downcasting {
	public static void main(String[] args) {
		AppleDevice appDev = new IPad();
		// appDev can access use method and startingPrice variable
		// reference type AppleDevice, object of IPad
		appDev.use();
		//appDev.draw(); is not accessible
		IPad ipad = (IPad)appDev;
		ipad.use();
		ipad.draw();
		
		AppleDevice dev2 = new Mac();
		dev2.use();
		
		// 1) using another reference variable
		Mac mac = (Mac)dev2;
		mac.code();
		//System.out.println(mac.model());
		
		// 2) cast and call in single statement
		((Mac)dev2).code();
		//System.out.println( ((Mac)dev2).model));
		
		
		
		
	}
}
