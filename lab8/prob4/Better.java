package lab8.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Better {
	
	final Function<Integer, Predicate<String>> lengthOfLen = len -> word -> word.length() == len;
	final Function<Character, Predicate<String>> containsChar = ch -> word -> word.contains(String.valueOf(ch)); 
	final Function<Character, Predicate<String>> notContainChar = ch -> word -> !word.contains(String.valueOf(ch)); 
	
	
	public static void main(final String[] args) {
		Better better = new Better();

		List<String> words = Arrays.asList("Tom", "Jerry", "Doug", "owl");

		System.out.println(better.countWords(words, 'o', 'g', 3));
	}

	public int countWords(List<String> words, char c, char d, int len) {

		return words.stream().filter(lengthOfLen.apply(len))
				.filter(containsChar.apply((c)))
				.filter(notContainChar.apply((d)))
				.collect(Collectors.toList()).size();
	}
}
