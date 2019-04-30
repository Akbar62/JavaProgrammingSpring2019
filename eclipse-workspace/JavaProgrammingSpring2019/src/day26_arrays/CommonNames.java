package day26_arrays;

import java.util.*;

public class CommonNames {

	public static void main(String[] args) {

		String[] commonNames = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
				"William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah",
				"Charles", "Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty",
				"Donald", "Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna",
				"Kenneth", "Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa",
				"Edward", "Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen",
				"Ryan", "Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley",
				"Stephen", "Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela",
				"Brandon", "Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond",
				"Catherine", "Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis",
				"Emma", "Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie",
				"Douglas", "Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly",
				"Walter", "Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith",
				"Gerald", "Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence",
				"Jean", "Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe",
				"Kathryn", "Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie",
				"Bruce", "Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy",
				"Beverly", "Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel",
				"Rose", "Louis", "Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip",
				"Jane", "Logan", "Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		// Find out how many names are in the array

		System.out.println("The total number of names is " + commonNames.length);

		System.out.println(Arrays.toString(commonNames));

		// Printing out names
		
		for (int i = 0; i < commonNames.length - 1; i++) {
			System.out.println(commonNames[i] + " " + commonNames[i + 1]);
			i++;
		}

		System.out.println("###################################");

		for (int i = 0; i < commonNames.length - 1; i = i + 2) {
			System.out.print(commonNames[i]+ ", ");
		}
		System.out.println();
		System.out.println("###################################");
//
//		for (int i = 1; i < commonNames.length - 1; i = i + 2) {
//			System.out.println(commonNames[i]);
//		}
		
		for(int i = 0; i < commonNames.length; i++) {
			if(i % 2 != 0) {
				if(i == commonNames.length -1 ) {
					System.out.print(commonNames[i]);
				} else {
					System.out.print(commonNames[i] + ", ");
				}
				//System.out.print(commonNames[i] + ", ");
			}
			
			
		}
		System.out.println();
		
		
		//Print a random name
		Random random = new Random();
		int r = random.nextInt(commonNames.length);
		System.out.println("\nRandom name: "+commonNames[r]);
		
		//Print names that are up to 4 characters and change to uppercase
		for(String names: commonNames) {
			if(names.length() <= 4) {
				System.out.print(names.toUpperCase()+", ");
			}
		}
		System.out.println("###################################");
		System.out.println("###################################");
		
		
		String names3to4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		for(String names: commonNames) {
			if(names.length() == 3 || names.length() == 4) {
				names3to4 += names+", ";
			} else if(names.length() == 5 || names.length() == 6) {
				names5to6 += names+", ";
			} else if(names.length() >= 7) {
				names7orMore += names+", ";
			}
		}
		
		System.out.print("\nNames with 3 or 4 characters: "+names3to4.substring(0,names3to4.length()-2));
		System.out.println();
		System.out.print("\nNames with 5 or 6 characters: "+names5to6.substring(0, names5to6.length()-2));
		System.out.println();
		System.out.print("\nNames with 7 or more characters: "+names7orMore.substring(0,names7orMore.length()-2 ));
		
		System.out.println("###################################");
		System.out.println("###################################");
		
		System.out.println(Arrays.toString(commonNames));
		
		String temp = "";
		
		for(int i = 0; i < commonNames.length; i+=2) {
			temp = commonNames[i];
			commonNames[i] = commonNames[i+1];
			commonNames[i+1] = temp;
			
		}
		
		System.out.println(Arrays.toString(commonNames));
		
	}

}
