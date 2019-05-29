package day51;

public class Snowboarding extends Exercise {
	
	public int perform(int mins) {
		int cals = super.perform(10); // call super class version of perform
		System.out.println("Snowboarding for " + mins + " minutes");
		return mins * 7 + cals;
	}

}
