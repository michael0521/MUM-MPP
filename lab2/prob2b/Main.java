package lab2.prob2b;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<OrderLine> list = new ArrayList<OrderLine>();
		
		/*Comment following two line will cause at least one OrderLine exception */
		OrderLine ol0 = new OrderLine(1);     
		list.add(ol0);					      
		
		Order order = new Order(110, list);
		List<OrderLine> lines = order.getOrderLines();
		
		OrderLine ol1 = new OrderLine(2);
		ol1.setOrder(order);
		System.out.println("Add " + ol1 + " to order "+ol1.getOrder().getOrderNum());
		OrderLine ol2 = new OrderLine(3);
		ol2.setOrder(order);
		System.out.println("Add " + ol2 + " to order "+ol1.getOrder().getOrderNum());
		
		lines.add(ol1);
		lines.add(ol2);
		
		System.out.println(order);
	}
}
