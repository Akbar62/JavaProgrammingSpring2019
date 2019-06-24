package day62_exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnchecked {
	public static void main(String[] args) {
		// checked exception - InterruptedException
		// HANDLE-OR-DECLARE
		try {
			System.out.println("Sleeping");
			Thread.sleep(2000);// checked exception
		} catch (InterruptedException e) {
			System.out.println("Thread is interrrupted");
		}

		System.out.println("Woke up");

		try {
			URL url = new URL("www.google");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
		}
	}

}
