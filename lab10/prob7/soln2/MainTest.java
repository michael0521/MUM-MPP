package lab10.prob7.soln2;


import lab10.prob7.Employee;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void testSalaryGreaterThan100000() {
		Employee e = new Employee("Steven", "Walters", 135000);
		Assert.assertEquals(true, Main.salaryGreaterThan100000(e));
	}

	@Test
	public void testLastNameAfterM() {
		Employee e = new Employee("Steven", "Walters", 135000);
		Assert.assertEquals(true, Main.lastNameAfterM(e));
	}

}
