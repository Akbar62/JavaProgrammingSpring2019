package day42_customclasses_encapsulation;
import java.util.*;
import java.lang.*; // this import is always added by default

public class StringShoesToObject {

	public static void main(String[] args) {
		// create Shoes object and assign the data from the String
		String data = "Bruno Magli, 9.5";
		String[] str = data.split(",");
		// create Shoes object 
		Shoes shoes = new Shoes();
		shoes.setShoesData(str[0], Double.parseDouble(str[1]));
		System.out.println(shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the shoe brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		// create an object using data from the scanner
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		
	}

}
