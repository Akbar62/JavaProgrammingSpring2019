package day51;

public class Swimming extends Exercise {
	@Override
	public int perform(int mins) {
		System.out.println("Swimming");
		return mins * 11;
	}
}
