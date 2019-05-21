package officehours14_may21;

public class CallPeopleFromHere {
	public static void main(String[] args) {
		// need to create an object to access
		// non static variable
		People mymanNursultan = new People();
		System.out.println(mymanNursultan.hardToGet);
		
		// no need to create object to access
		// static variable
		System.out.println(People.easyToGet);
		
		// use object to access the non static method
		mymanNursultan.sayMyName();
		
		// use class name to access the static method
		People.whatMyName();
		
	}

}
