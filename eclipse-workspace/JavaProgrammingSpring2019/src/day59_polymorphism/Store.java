package day59_polymorphism;

import java.util.*;

public class Store {
	public static void main(String[] args) {
		HairSpray hp = new HairSpray();
		hp.catchFire();

		Flammable hairSp = new HairSpray();
		hairSp.catchFire();

		Flammable pTank = new PropaneTank();
		pTank.catchFire();

		Flammable item;
		item = new HairSpray();
		item = new PropaneTank();

		List<Flammable> items = new ArrayList<>();
		
	}

}
