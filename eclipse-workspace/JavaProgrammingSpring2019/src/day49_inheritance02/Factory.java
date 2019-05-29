package day49_inheritance02;
		// Factory is a non sub class that is in the same package
public class Factory {
	public static void main(String[] args) {
		Device d = new Device();
		d.brand = "LG";
		d.model = "efwf";
		d.price = 70;
		d.price = 4300;
		// System.out.println("Price: " + price); not inherited, not visible
	}

}
