package lab4.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Hourly h1 = new Hourly(1, 60, 40);
		h1.print();
		h1.calcCompensation(0, 0).print();;
		
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, LocalDate.of(2015, 7, 23), 10000));
		orders.add(new Order(2, LocalDate.of(2015, 7, 23), 20000));
		orders.add(new Order(3, LocalDate.of(2015, 5, 23), 30000));
		orders.add(new Order(6, LocalDate.of(2015, 6, 23), 10000));
		Commissioned c1 = new Commissioned(2, orders, 0.05, 500);
		c1.calcCompensation(7, 2015).print();;
		
		Salaried s1 = new Salaried(3, 6000);
		s1.calcCompensation(0, 0).print();
		
	}
}
