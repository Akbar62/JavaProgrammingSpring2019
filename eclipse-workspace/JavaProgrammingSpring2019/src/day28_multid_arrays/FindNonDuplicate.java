package day28_multid_arrays;
import java.util.*;
public class FindNonDuplicate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    for(int i = 0; i > nums.length-1; i++) {
	    	if(nums[i] == nums[i+1] || nums[i+1] == nums[i+2]
	    			|| nums[i+2] == nums[i+3] || nums[i+3] == nums[i+4] 
	    			|| nums[i+4] == nums[i+5] || nums[i+5] == nums[i+6]
	    			|| nums[i+6] == nums[i+7]) {
	    			return;
	    	} else {
	    		System.out.println(i);
	    	}
	    
	    				
	    }
	    
	    String str = Arrays.toString(nums);
	    System.out.println(str);
	    

	}

}
