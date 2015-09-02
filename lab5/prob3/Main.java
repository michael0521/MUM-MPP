package lab5.prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<IComputeArea> list = new ArrayList<>();
		list.add(new Circle(5.0));
		list.add(new Rectangle(4.0, 5.0));
		list.add(new Triangle(5.0, 6.0));
		
		for (IComputeArea c : list) {
			System.out.println(c.getClass().getSimpleName() + " " + c.computeArea());
		}
		
	}
}
