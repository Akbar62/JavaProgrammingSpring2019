package day43_encapsulation_constructor;

public class TeslaDealer {

	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);

		System.out.println("Model: " + tesla.getModel());
		System.out.println("range: " + tesla.getRange());
		System.out.println("0to60: " + tesla.getZeroTo60());
		System.out.println("price: " + tesla.getPrice());
		System.out.println("selfDriving: " + tesla.isSelfDriving());

		Tesla myTesla = new Tesla();
		myTesla.setTeslasInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		// tesla, myTesla
		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		} else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		}

		buy(myTesla);
		buy(tesla);
		testDrive("Model S");
		Tesla testCar = testDrive("Model 3");
		System.out.println(testCar.toString());

	}

	public static void buy(Tesla car) {
		System.out.println("Purchasing:" + car.toString());
	}

	public static Tesla testDrive(String model) {
		Tesla tesla1 = new Tesla();
		System.out.println("I would like to test drive - " + model);
		System.out.println("-Sure, let me build the object and return it");
		tesla1.setTeslasInfo(model, 310, 2.5, 95000, false);
		return tesla1;
	}

}
