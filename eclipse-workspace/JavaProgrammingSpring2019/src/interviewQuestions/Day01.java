package interviewQuestions;

public class Day01 {
	public static void main(String[] args) {
		/*
		 
		1. How do you combine two Strings?
		
		by using the concat method
		
		2. What’s the differences between StringBuffer and StringBuilder? What’s synchronization?
		
		Stringbuffer and Stringbuilder are mutable versions of sequences of characters
		Stringbuffer 
			- Synchronized and thread safe
			- All the methods in Stringbuffer contain the specifier "Synchronize"
			Disadvantages
			- Very slow
			- Performance problems
			
			
		
		3. Tell me the differences between void and non-void methods
		
		void methods do not return a value.
		non-void methods must return a value. (Data type has to be the same as the
		one stated in the method
		
		4. Can you explain what is 'public static void' ?
		
		public is an access modifier, visible to everything.
		static is a specifier, any feature that has static belongs to the class
		void is no return value
		
		
		5. Briefly explain the differences between Array and ArrayList
		
		- Array is a fixed size, ArrayList has a dynamic size
		- ArrayList does not support primitives, must use the wrapper class
		- Array needs to be converted to a String to print, it prints a hashcode
		by default.
		- Arrays can be multi-dimensional but ArrayLists cannot
		
		
		6. What are the primitives and wrapper classes in java? Their differences
		
		Primitives : byte, short, int, long, float, double, boolean, char
		Wrapper class : Byte, Short, Int, Long, Float, Double, Boolean, Character
		
		 differences:
		 	- Wrapper classes are objects
		 	- null can only be assigned to Wrapper classes
		 	- Wrapper classes have methods
		 	- Primitives does have default values
		 	
		 	Primitive default values: 0, 0.0, false, empty
		 	Wrapper class default values: null
		 	
		
		7. Explain me the method overloading and method overriding? 
				Return type of overloaded method should be same or not?
				Can you overload and override the constant methods?
				
			overloading: any method can be overloaded
					   - same name but different parameters
					   - can overload in the same or a sub class
					   - return type does not have to be the same
					   
			overriding: only instance methods can be overriden 
			( no final or private )
					  - Must override in sub class
					  - Access modifer needs to be as or more visible
					  - return type and parameter must be the same
					  - @Override can be used
					  
		
		8.	differences between instance variable, class variables and local variables? 
		
			instance variables belong to an Object
			Class variables ( static variables ) belong to the class
			local variables are declared within the method or blocks
			
			
		9.	what’s an instance method ? What is static method?
		
			instance methods belong to an Object
			static methods belong to the Class
			( there is no Object instances in static methods )
		
		10.	what’s constructor? Declaration ?
		
			special method
			The compiler will generate a default constuctor if none is stated,
			but you can decalre an explicit constructor instead.
		
		11.	inner class VS outer class
				1. Outer class be static?   no 
				2. Can inner class be static?  yes
				3. Can you create an object from the inner class? 
					only if its static 
				4. can we have main method in inner class ?
					only if its static
					inner class can only be extended if its static
		
		12.	what are the blocks in java that you have used in your framework?
		
			instance block
			static block
			finally block
		
		13.	difference between final and finally?
		
			final is a specifier 
				- can only be applicable to methods, variables, and classes
			finally is a block, it must be declared with try and catch blocks 
			
		
		14. What is toString method in java.
		
		 A method of the String class used to convert an Object into a String
		
		15. Did you use Encapsulation in your framework? 
					How ? What’s the befits of using encapsulation?
					
		
		 
		
		Your assignment:
	1. Create a return method that can remove duplicated values from an int Array.  Do not use Set interfaces.
	2. Create a method that can divide two numbers without using division operators and Math class.

		 
		 */
		
		StringBuffer str1 = new StringBuffer("Name");
		// convert StringBuffer to a String
		
		String str2 = str1.toString();
	}
	
//	public static int[] removeDuplicates(int[] arr) {
//		
//		int[] remove = new int[arr.length];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				
//			}
//			
//		}
//		
//		
//		return arr;
//		
//	}

}
