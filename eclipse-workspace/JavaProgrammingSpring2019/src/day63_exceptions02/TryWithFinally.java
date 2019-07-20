package day63_exceptions02;

public class TryWithFinally {
	public static void main(String[] args) {

		try {
			System.out.println("In Try Block");
			System.out.println(10 / 0);

		} finally {
			System.out.println("In finally");

		}

		System.out.println("After Finally");
	}
}
