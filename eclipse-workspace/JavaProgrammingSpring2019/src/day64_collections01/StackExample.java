package day64_collections01;
import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> numsStack = new Stack<>();
		numsStack.add(50);
		numsStack.push(60);
		numsStack.push(70);
		
		System.out.println(numsStack.toString());
		// check value on top of stack
		System.out.println(numsStack.peek());
		// read value on top of stack and remove it
		System.out.println(numsStack.pop());
		
		System.out.println(numsStack.peek());
		
		System.out.println(numsStack.toString());
		
		System.out.println(numsStack.get(0));
		
		
		
	}

}