package day24_arrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		
		int[] numbers = {12,41,213,21,42,16};
		boolean equals = numbers[0] == numbers[numbers.length-1];
		
		System.out.println(equals);
	}

}
