package day42_customclasses_encapsulation;

public class MyCoffees {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.name = "Iced caramel machiatto";
		coffee1.size = "Venti";
		coffee1.price = 4.75;
		coffee1.calories = 250;
		
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("Java chip");
		coffee2.size = "Venti";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
		
		Coffee coffee3 = new Coffee();
		coffee3.setName("Iced coffee");
		coffee3.setSize("Tall");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		System.out.println("coffee3 name: "+ coffee3.name);
		coffee3.getCoffeeInfo();
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("Flat White", "Tall", 3.95, 170);
		coffee4.getCoffeeInfo();
		
		
	}

}
