package lab8.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();

		List<String> words = Arrays.asList("Tom", "Jerry", "Doug", "owl");

		System.out.println(good.countWords(words, 'o', 'g', 3));
	}

	public int countWords(List<String> words, char c, char d, int len) {

		return words.stream().filter(word -> word.length() == len)
				.filter(word -> word.contains(String.valueOf(c)))
				.filter(word -> !word.contains(String.valueOf(d)))
				.collect(Collectors.toList()).size();
	}
}
