package lab10.prob7.soln1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import lab10.prob7.Employee;
import lab10.prob7.Main;

import org.junit.Test;

public class MainTest {

	@Test
	public void testAsString() {
		List<Employee> emps = Arrays.asList(new Employee("Steven", "Walters", 135000), new Employee("Thomas", "Blake", 111000));
		assertEquals("The two employee are equal ", "Steven Walters", Main.asString(emps));
	}

}
