package day12_switch_ternary;
import java.util.*;
public class Weather {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's the weather like today?");
		String weather = keyboard.next().toLowerCase();
		
		switch (weather) {
			case "sunny":
			System.out.println("Go to the park");
			System.out.println("Code Java");
			break;
			case "hot":
			System.out.println("Go swimming");
			System.out.println("Code Java");
			break;
			case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
			case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
			case "snowy":
			System.out.println("Change your tires");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
			default:
				System.out.println("Go code Java");
		}

	}

}
