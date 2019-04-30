package day10_logicaloperators_conditionals;

public class IFStatementsWithBooleanVariables {

	public static void main(String[] args) {
		boolean isBreakTime = false;
		
		if(isBreakTime) {
			System.out.println("It's break time!");
		} else {
			System.out.println("It is not break time");
		}
		boolean classTime = true;
		
		if(classTime) {
			System.out.println("Stop talking");
			System.out.println("Stop talking");
			System.out.println("Pay attention");
			System.out.println("Code and have fun!");
		}else {
			System.out.println("Take a walk and have some water.");
		}
		
		boolean qualified = false;
		
		if(qualified == false) {
			System.out.println("Your application was not approved. Thank you");
		}
	}

}
