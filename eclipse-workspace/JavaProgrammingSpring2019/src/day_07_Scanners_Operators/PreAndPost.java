package day_07_Scanners_Operators;

public class PreAndPost {

	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		int n = 0;
		int n2 = ++n;
		
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);
		
		int bananas = 6;
		int apples = ++bananas;
		int pears = bananas++;
		
		System.out.println("bananas:" + bananas);
		System.out.println("pears:" + pears);
		System.out.println("apples: " + apples);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("Batteries: " + batteries);
		System.out.println("Old Batteries: " + oldBatteries);
		System.out.println("Total Batteries: " + totalBatteries);
		
	}

}
