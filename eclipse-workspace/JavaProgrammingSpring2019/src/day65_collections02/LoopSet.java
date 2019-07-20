package day65_collections02;
import java.util.*;

public class LoopSet {
	public static void main(String[] args) {
		
		Set<Integer> numsSet = new HashSet<>();
		numsSet.add(10);
		numsSet.add(10);
		numsSet.add(10);
		numsSet.add(10);
		numsSet.add(10);
		numsSet.add(10);
		numsSet.add(10);
		numsSet.add(10);
		
		// HashSet can only store unique values
		
		System.out.println(numsSet.size());
		
	}

}
