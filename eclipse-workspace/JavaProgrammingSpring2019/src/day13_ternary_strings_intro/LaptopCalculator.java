package day13_ternary_strings_intro;
import java.util.*;
public class LaptopCalculator {

	public static void main(String[] args) {
		double price = 0;
		double screenSize = 0;
		String storageType, screenType, cpu;
		int ram = 0 ; 
		int storageSize = 0;
		Scanner scan = new Scanner(System.in);
     
		System.out.println("Select screen size:");
		screenSize = scan.nextDouble();
		if(screenSize == 13.3) {
			price = price + 200;
		} else if(screenSize == 15.0) {
			price = price + 300;
		} else if(screenSize == 17.3) {
			price = price + 400;
		}
		
		System.out.println("Select CPU type:");
		cpu = scan.next();
		if(cpu.contentEquals("i3")) {
			price = price + 150;
		} else if(cpu.contentEquals("i5")) {
			price = price + 250;
		} else if(cpu.contentEquals("i7")) {
			price = price + 350;
		}
		
		System.out.println("Selct RAM size");
		ram = scan.nextInt();
		if(ram == 4) {
			price = price + 50;
		} else if(ram == 8) {
			price = price + 50;
		}
		
		System.out.println("Select storage type:");
		storageType = scan.next();
		if(storageType.contentEquals("HDD")) {
			if(storageSize == 500) {
				price = price + 50;
			} else if(storageSize == 100) {
				price = price + 100;
			}
		} else if(storageType.contentEquals("SSD")) {
			if(storageSize == 500) {
				price = price + 100;
			} else if(storageSize == 1000) {
				price = price + 200;
			}
		}
		
		System.out.println("Enter screen resolution:");
		screenType = scan.next();
		if(screenType.contentEquals("FULLHD")) {
			price = price + 100;
		}else if(screenType.contentEquals("4K")) {
			price = price + 200;
		}
		
		System.out.println("Laptop price is: " +price);
	}

}
