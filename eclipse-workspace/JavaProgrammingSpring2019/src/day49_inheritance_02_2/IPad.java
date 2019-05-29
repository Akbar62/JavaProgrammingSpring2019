package day49_inheritance_02_2;

import day49_inheritance02.Device;

// iPad is a Device. iPad is a subclass in a different package
public class IPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book " + title + " using " + brand + " tablet");
		System.out.println("Model - " + model);
		//System.out.println("Price: " + price);
		// not inherited, not visible
		
	}
	

}
