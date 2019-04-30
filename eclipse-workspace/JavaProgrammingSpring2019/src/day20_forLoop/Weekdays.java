package day20_forLoop;

public class Weekdays {

	public static void main(String[] args) {
		
		String weekday = "";
		
		for(int day = 1; day <= 7; day++) {
			
			switch(day) {
			case 1:
			weekday = "Monday";
			System.out.println("Monday");
			break;
			case 2:
			weekday = "Tuesday";
			System.out.println("Tuesday");
			break;
			case 3:
			weekday = "Wednesday";
			System.out.println("Wednesday");
			break;
			case 4:
			weekday = "Thursday";
			System.out.println("Thursday");
			break;
			case 5:
			weekday = "Friday";
			System.out.println("Friday");
			break;
			case 6:
			weekday = "Saturday";
			System.out.println("Satuday");
			break;
			case 7:
			weekday = "Sunday";
			System.out.println("Sunday");
			break;
			default:
			}
		}
		
		//System.out.println("The day of the weeks are "+weekday);
	}

}
