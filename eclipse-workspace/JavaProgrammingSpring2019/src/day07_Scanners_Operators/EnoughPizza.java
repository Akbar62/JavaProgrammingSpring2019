package day07_Scanners_Operators;

public class EnoughPizza {

	public static void main(String[] args) {
		
		int pizzaCount = 40;
		int studentsCount = 145;
		
		boolean isEnoughPizza = pizzaCount * 8 >= studentsCount * 2;
		System.out.println("is Enough Pizza: " + isEnoughPizza);

	}

}
