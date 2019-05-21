package day47_blocks;

public class VariableAccess {
	// instance variable
	int myInstanceVar = 40;
	
	// static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
		// System.out.println(myInstanceVar);
	    // cannot access non-static from a static method
		System.out.println(myStaticVariable);
		// create object of variable access and print myInstanceVar
		VariableAccess var = new VariableAccess();
		System.out.println(var.myInstanceVar);
		// access static variable using object
		System.out.println(var.myStaticVariable);
		// access static variable using classname
		System.out.println(VariableAccess.myStaticVariable);
	}

}
