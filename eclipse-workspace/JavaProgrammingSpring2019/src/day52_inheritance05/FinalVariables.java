package day52_inheritance05;

public class FinalVariables {
	public final int ROADSTER_MAX_RANGE = 610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	// when instance variable is final, we need to assign a value in statement,
	// constructor, or init block
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	// static needs a static block
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}

	public FinalVariables() {
		MODEL_3_MAX_SPEED = 180;
	}

	{ // init block
		MODEL_X_PASSENGERS = 7;
	}

	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5;
		// the below line will not work because of the final keyword
		// MAX_PASSENGERS_COUNT = 10;
		final double PI = Math.PI;
		System.out.println(MAX_PASSENGERS_COUNT);
		// We can declare a local variable and initialize it
		final int SSN;
		SSN = 425345;
		// SSN++ is not possible
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range for roadster: " + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: " + finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model x passengers: " + finalVars.MODEL_X_PASSENGERS);
		
		System.out.println("Company name: " + COMPANY_NAME);
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		

	}

}
