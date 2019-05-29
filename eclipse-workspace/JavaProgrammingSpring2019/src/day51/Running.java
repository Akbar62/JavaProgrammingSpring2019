package day51;

public class Running extends Exercise {
	@Override
	public int perform(int mins) {
		System.out.println("Running");
		return mins * 10;
	}
}
