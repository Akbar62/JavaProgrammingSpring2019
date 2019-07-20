package practice;

public class Replit7_4 {
	
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		System.out.println(sumColumn(a,1)); //should print -9
		System.out.println(sumColumn(a,3)); //should print 5
		
		System.out.println(sumRow(a,1));
		System.out.println(sumRow(a,2));
		
	}

	public static int sumColumn(int[][] arr, int num) {
		
		// column...
		// 
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum+= arr[i][num];
		}
		
		return sum;
	}
	
	public static int sumRow(int[][] arr, int num) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum+= arr[num][i];
		}
		
		return sum;
	}

}
