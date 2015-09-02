package lab9.prob2;

import java.math.BigInteger;
import java.util.stream.Stream;

public class InfinitePrimesA {

	static final Stream<BigInteger> s1 = Stream.iterate(BigInteger.valueOf(2),
			n -> n.nextProbablePrime());

	public static void main(String[] args) {

		s1.forEach(i -> System.out.println(i));

	}
}
