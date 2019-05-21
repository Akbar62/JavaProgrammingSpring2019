package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;

	public void getCoffeeInfo() {
		String info = "You ordered a " + size + " " + name + ". It cost " + price + " and has " + calories
				+ " calories";
		System.out.println(info);
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setSize(String newSize) {
		size = newSize;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public void setCalories(int newCal) {
		calories = newCal;
	}
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		size = newSize;
		price = newPrice;
		calories = newCal;
	}
}
