package day47_blocks;

public class AllBlocks {

	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("static block - I run first and only once");
		staticInt--;
	}

	{
		System.out.println("initializer block - I run each time object is created. Before constrcutor");
		nonStaticInt += 5;
		staticInt += 5;
	}

	public AllBlocks() {
		System.out.println("Constructor - I run each time an object is created. after init block");
		nonStaticInt += 3;
		staticInt += 3;
	}

}
