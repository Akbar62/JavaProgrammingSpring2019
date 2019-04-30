package day20_forLoop;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		for(int a = 2; a < 100; a += 2) {
			if(a % 2 == 0) {
				 //sumEven = a;
				System.out.print(a+" ");
			}
		}
		
		System.out.println();
		
		for(int k = 1; k < 100; k += 2) {
			if(k % 2 != 0) {
				//sumOdd = k;
				System.out.print(k+" ");
			}
		}
		
		int sumEven = 0;
		int sumOdd = 0;
		//System.out.println("\n"+sumOdd + sumEven);
		
		for(int num = 1;num <= 100; num++) {
			if(num % 2 == 0) {
				sumEven += num;
			}else if (num % 2 !=2) {
				sumOdd += num;
			}
		}
		
		System.out.println();
		System.out.println("Sum of evens: "+sumEven);
		System.out.println("Sum of odds: "+sumOdd);
		
	}

}
