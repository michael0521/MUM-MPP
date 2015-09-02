package lab8.prob5;

import java.util.Arrays;
import java.util.List;

public class ForEachExampleA {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays
				.asList("Hello there", "Goodbye", "Back soon", "Away",
						"On Vacation", "Everywhere you want to be");

		// print each element of the list in upper case format
		list.forEach(t -> System.out.println(t.toUpperCase()));
	}
}