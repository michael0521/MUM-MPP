package lab10.prob1;

import java.util.List;
import java.util.stream.Collectors;

public class TDDPractice {

	public List<String> changeLastCharToUpper(List<String> words) {
		List<String> list = words
				.stream()
				.map(w -> {
					int len = w.length();
					return w.substring(0, len - 1).concat(
							w.substring(len - 1).toUpperCase());
				}).collect(Collectors.toList());
		return list;
	}

}
