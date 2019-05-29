package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final method 1");
	}

}

class Sub extends FinalMethods {
	// cannot override since it is a final method
//	public void method1() {
//		System.out.println("Overrided method 1");
//	}

	public void method1(String str) {
		System.out.println("Overloaded method " + str);
		// final methods can be overloaded, since when a method is overloaded,
		// java looks at it like an independent method
	}

}
