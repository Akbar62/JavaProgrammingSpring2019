package day15_string_manipulation;

public class OperatorShit {

	public static void main(String[] args) {
		
		double double1 = 20;
		double double2 = 80;
		double sum = (double1 + double2) * 25;
		System.out.println(sum);
		double remainder = sum % 40;
		System.out.println(remainder);
		if(remainder <=20) {
			System.out.println("Total was over the limit");
		}
		
		

	}

}
