package day61_polymorphism03;

import java.util.Scanner;
import day49_inheritance02.TV;
import day57_interfaces.Tesla;
import day60_polymorphism02.*;

public class MethodsUsingPolymorphism {
	public static void main(String[] args) {
		AppleDevice ap1 = new Mac();
		purchase(ap1);

		purchase(new AppleWatch());

		giveMeAnyObject(new String("Hi"));
		giveMeAnyObject(new Scanner(System.in));
		giveMeAnyObject(new TV());
		giveMeAnyObject(new Tesla());

		Object tv = new TV();
		Object str = new String("java");
		Object d = new AppleWatch();
	}

	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing: " + ap.getClass().getSimpleName());
	}

	public static void giveMeAnyObject(Object object) {
		System.out.println("You gave me: " + object.getClass().getSimpleName());
	}

	// Method buildAppleDevice, return type: AppleDevice
	public static AppleDevice buildAppleDevice() {
		AppleDevice ap = new AppleWatch();

		return ap;
	}

	public static AppleDevice buildDevice(String type) {
		if (type.equals("ipad")) {
			return new IPad();
		} else if (type.equals("mac")) {
			return new Mac();
		} else if (type.equals("applewatch")) {
			return new AppleWatch();
		} else {
			return null;
		}
	}
}
