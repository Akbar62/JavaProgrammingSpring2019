package practice;

public class Test5Replits {
	
	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			int[] sums = rowSums(a);
			for(int sum : sums)
				System.out.println(sum);
		
	}
	
	public static int[] rowSums(int[][] nums) {
		  
		  int[] arr = new int[nums.length];
		  
		  for(int i = 0; i < nums.length; i++) {
			  int sum = 0;
		    for(int j = 0; j < nums[i].length; j++) {
		      sum += nums[i][j];
		    }
		    
		    arr[i] = sum;
		  }
		  
		  return arr;
			
		}

}
