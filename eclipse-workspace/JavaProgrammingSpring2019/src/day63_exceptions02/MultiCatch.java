package day63_exceptions02;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			// System.out.println(0 / 0);
			// String str = null;
			// System.out.println(str.length());
			int[] n = { 2, 47 };
			System.out.println(n[2]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception happened");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception happened");
		} catch (RuntimeException e) {
			System.out.println("Run time exception happened" + e.getClass().getSimpleName());
		}
	}

}
