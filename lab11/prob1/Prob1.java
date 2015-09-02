package lab11.prob1;

import java.util.ArrayList;
import java.util.List;

public class Prob1 {
	public static void main(String[] args) {
//		List<Integer> ints = new ArrayList<Integer>();
//		ints.add(1);
//		ints.add(2);
		//List<Number> nums = ints;
		//nums.add(1.3);
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		//nums.add(12);
	}
}
