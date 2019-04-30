package office_hours;
import java.util.*;
public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int season = scan.nextInt();
		
		if(season == 12 || season == 1 || season == 2) {
			System.out.println("Winter");
		} else if(season == 6 || season == 7 || season == 8) {
			System.out.println("Summer");
		} else if(season == 3 || season == 4 || season == 5) {
			System.out.println("Spring");
		} else if(season == 9 || season == 10 || season == 11) {
			System.out.println("Fall");
		}
	}

}
