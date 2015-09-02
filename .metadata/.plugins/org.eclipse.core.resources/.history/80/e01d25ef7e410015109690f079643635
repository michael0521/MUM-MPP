package lab9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSet {
	public Set<String> union(List<Set<String>> sets){
		Set<String> set = new TreeSet<String>();
		return sets.stream().reduce((x,y)-> { x.addAll(y); return x;}).get();
	}
	
	public static void main(String[] args) {
		List<Set<String>> list = new ArrayList<>();
		
		list.add(new HashSet<String>(Arrays.asList("A", "B")));
		list.add(new HashSet<String>(Arrays.asList("D")));
		list.add(new HashSet<String>(Arrays.asList("1", "3", "5")));
		
		System.out.println(new ListToSet().union(list));
	}
}
