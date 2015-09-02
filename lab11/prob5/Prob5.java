package lab11.prob5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Prob5 {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 9, 8, 4, 5);
		List<String> strs = Arrays.asList("a", "b", "w", "z");
		Integer i = secondSmallest(ints);
		String s = secondSmallest(strs);
		System.out.println(s);
		
	}
	private static <T extends Comparable<? super T>> T secondSmallest(List<T> items){
		
		Collections.sort(items);
		Collections.reverse(items);
		return items.get(1);
	}
}
