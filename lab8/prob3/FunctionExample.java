package lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionExample {

	BiFunction<Double, Double, List<Double>> bf = (x, y) -> {
		List<Double> list = new ArrayList<>();
		list.add(Math.pow(x, y));
		list.add(x * y);
		return list;
	};

	public static void main(String[] args) {
		System.out.println(new FunctionExample().bf.apply(2.0, 3.0));
	}

}
