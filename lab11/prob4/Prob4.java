package lab11.prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prob4 {
	
	public static double sum(Collection<? extends Number> nums){
		double s = 0.0;
		for (Number num : nums){
			s += num.doubleValue();
		}
		return s;
	}
	
	public static void main(String[] args) {
//		List<Integer> ints = new ArrayList<Integer>();
//		ints.add(1);
//		ints.add(2);
//		List<? extends Number> nums = ints;
//		double db1 = sum(nums);
		//nums.add(1.3);
		
		List<Object> objs = new ArrayList<Object>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(3);
		//double db1 = sum(ints);
	}

}
