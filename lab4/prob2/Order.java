package lab4.prob2;

import java.time.LocalDate;

public class Order {
	
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	public double getOrderAmount() {
		return orderAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	
}
