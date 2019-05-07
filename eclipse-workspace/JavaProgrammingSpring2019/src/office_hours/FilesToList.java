package office_hours;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FilesToList {

	public static void main(String[] args) throws FileNotFoundException {
		// create file object
		File file = new File("products.txt");
		// open file using scanner
		Scanner scan = new Scanner(file);
		// System.out.println(scan.nextLine());
		// hasNextLine will be true if there is a line of data
		while (scan.hasNextLine()) {
			// it reads a line and th
			System.out.println(scan.nextLine());
		}
	}

}
