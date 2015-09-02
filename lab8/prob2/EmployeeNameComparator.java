package lab8.prob2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int temp = e1.name.compareTo(e2.name);
		return temp==0? Integer.valueOf(e1.salary).compareTo(e2.salary):temp;
	}
}
