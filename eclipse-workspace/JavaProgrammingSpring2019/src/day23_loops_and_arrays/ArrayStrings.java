package day23_loops_and_arrays;

public class ArrayStrings {

	public static void main(String[] args) {

		String[] names = new String[5];
		String[] names2 = { "shaun", "roman", "vlad", "burak", "maria" };
		
		System.out.println(names2[4]);
        System.out.println("Number of items: " + names2.length);
        String[] countries = { "" };
        // double[] values =
        // ARRAY HAS FIXED SIZE
        countries[0] = "USA";
        // String name = null;
        String[] fruits = new String[] { "apple", "orange" };
        // for each loop stands for collections of data
        // we need specify data type, variable name : our collection of data
        //for each loop
        // or enhanced loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
		
	}

	
}
