package day49_inheritance_02_2;
import day49_inheritance02.Device;
// non-subclass in different package


public class OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		// dv.model  = "3200";
		//dv.price = 1000; not visible
	}

}
