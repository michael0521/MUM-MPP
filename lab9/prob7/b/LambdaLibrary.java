package lab9.prob7.b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static TriFunction<List<Employee>, Integer, Integer, String> TF_NAMES = (
			list, salary, letter) -> list.stream()
			.filter(e -> e.getSalary() > salary)
			.filter(e -> (int) e.getLastName().charAt(0) > letter)
			.map(e -> e.getFirstName() + " " + e.getLastName()).sorted()
			.collect(Collectors.joining(","));
}
