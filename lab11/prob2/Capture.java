package lab11.prob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Capture {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aa", "bb" , "cc");
		reverse(list);
		System.out.println(list);
	}
	
	public static void reverse(List<?> list){
		reverseHelper(list);
	}
	
	private static <T> List<T> reverseHelper(List<T> list){
		 Collections.reverse(list);
		
		return list;
	}
}
