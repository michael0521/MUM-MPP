package lab10.prob1;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestTDDPractice {

	@Test
	public void test() {
		TDDPractice t1 = new TDDPractice();
		List<String> actual = Arrays.asList("abc", "def", "ghi");
		List<String> expected = Arrays.asList("abC", "deF", "ghI");
		Assert.assertArrayEquals(expected.toArray(),
				t1.changeLastCharToUpper(actual).toArray());
	}

}
