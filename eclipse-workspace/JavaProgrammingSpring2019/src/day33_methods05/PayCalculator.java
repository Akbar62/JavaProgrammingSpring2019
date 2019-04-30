package day33_methods05;

public class PayCalculator {

	public static void main(String[] args) {
		
		int pay = getHourlyPay(40, 37);
		System.out.println(getHourlyPay(40,25));

	}
	
	public static int getHourlyPay(int hours, int rate) {
		int totalPay = hours * rate;
		
		if(hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if(rate <= 0) {
			System.out.println("Invalid rate");
			return 0;
		}
		
		
		return totalPay;
		
	}

}
