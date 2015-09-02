package lab9.prob4;

import java.util.stream.IntStream;

public class InfinitSquares {
	public static void main(String[] args) {
		printSquares(20);
	}
	
	public static void printSquares(int num){
		IntStream.iterate(1, n -> n+1).limit(num).map(x -> x*x).forEach(System.out::println);
	}
}
