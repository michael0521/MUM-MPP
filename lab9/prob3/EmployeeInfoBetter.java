package lab9.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	static Function<Employee, String> byName = e -> e.getName();
	static Function<Employee, Integer> bySalary = e -> e.getSalary();
	static HashMap<SortMethod, Comparator<Employee>> map = new HashMap<>();
	
	public void sort(List<Employee> emps, final SortMethod method) {
//		if(method == SortMethod.BYNAME) {
//			Collections.sort(emps, Comparator.comparing(byName).thenComparing(bySalary).reversed());
//		} else {
//			Collections.sort(emps, Comparator.comparing(bySalary).thenComparing(byName));
//		}	
		Collections.sort(emps, map.get(method));
	}
	
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		map.put(EmployeeInfoBetter.SortMethod.BYNAME, Comparator.comparing(byName).thenComparing(bySalary).reversed());
		map.put(EmployeeInfoBetter.SortMethod.BYSALARY, Comparator.comparing(bySalary).thenComparing(byName));
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
