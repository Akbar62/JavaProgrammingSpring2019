package review_vasyl;

public class WrapperClassPractice {
	public static void main(String[] args) {
		int num = 10;
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(10);
		System.out.println(num == num2);
		System.out.println(num2 == num3);
		// intValue() will return the actual value
		System.out.println(num2.intValue() == num3.intValue());
		// contains the same int value as this object
		System.out.println(num2.equals(num3));
		num2 = num3;
		System.out.println(num2 == num3);
		// how to convert text into a number
		String age = "25";
		// first way it returns an int primitive
		int agenum = Integer.parseInt(age);
		// another way it returns an object of Integer class
		// because of auto-unboxing we don't see any difference
		int agenum2 = Integer.valueOf(age);
		if(agenum > 21) {
			System.out.println("You are fine!");
		}else {
			System.out.println("Underage");
		}
		Integer n = 8;
		String text = "Wind: 5mph";
		// create an if statement to see if the wind is safe
		// if speed > 30, print "You are in danger!"
		// else print "You are safe!"
		//String speed = text.substring(text.indexOf(':')+2,text.indexOf(" "));
		String speed = text.substring(text.indexOf(":") + 2, text.length()-3);
		System.out.println(speed);
		int num1 = Integer.parseInt(speed);
		if(num1 > 30) {
			System.out.println("You are un danger");
		}else {
			System.out.println("You are safe");
		}
		
		
	}

}
