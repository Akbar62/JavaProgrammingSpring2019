package day40_customclasses_methods;

public class BestBuy {

	public static void main(String[] args) {
		// System.out.println(brand);
		// above line will not work, we need to create an object
		// create CellPhone object
		CellPhone cell = new CellPhone();
		System.out.println(cell.brand);
		System.out.println(cell.screenSize);
		cell.brand = "Nokia 6300";
		cell.screenSize = 2.0;
		cell.color = "Silver";
		cell.price = 76.16;

		System.out.println("Brand: " + cell.brand);
		System.out.println("Screen size: " + cell.screenSize);
		System.out.println("Color: " + cell.color);
		System.out.println("Price: " + cell.price);

		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;

		System.out.println("##### CELL PHONE 2 #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Screen size: " + cell2.screenSize);
		System.out.println("Color: " + cell2.color);
		System.out.println("Price: " + cell2.price);

		System.out.println("##### CALLING METHODS #####");
		cell.call();
		cell.message();
		cell.takePhoto();
		
		cell2.call();
		cell2.message();
		cell2.takePhoto();
	}

}
