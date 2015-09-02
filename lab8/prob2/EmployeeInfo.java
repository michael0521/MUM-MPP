package lab8.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
//	SortMethod method;
	
//	public EmployeeInfo(SortMethod method) {
//		this.method = method;
//	}
	public void sort(List<Employee> emps, final SortMethod method) {
		
		class EmployeeNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(method == SortMethod.BYNAME) {
					return e1.name.compareTo(e2.name);
				} else {
					if(e1.salary == e2.salary) return 0;
					else if(e1.salary < e2.salary) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(emps, new EmployeeNameComparator());
	
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
//		Employee joe = new Employee("Joe", 100000);
//		Employee joe2 = new Employee("Joe", 200000);
//		System.out.println("joe equals joe2? " + joe.equals(joe2));
//		EmployeeNameComparator c = new EmployeeNameComparator();
//		System.out.println("joe equals joe2? " + (c.compare(joe, joe2)==0) );

		
		
		//EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		new EmployeeInfo().sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
		/*
		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);*/
	}
}
