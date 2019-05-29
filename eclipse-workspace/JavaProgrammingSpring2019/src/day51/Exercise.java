package day51;

public class Exercise {

	public int perform(int mins) {
		System.out.println("Performing general exercises");
		return mins * 4;
	}
	
	// multiple classes can be stored in the same file but only one of them
	// can be public, and file name must match the public class
	

	class Running extends Exercise {
		
	}

	class Swimming extends Exercise {

	}

	class Yoga extends Exercise {

	}

	class JuiJitsu extends Exercise {

	}

}
