package lab2.prob2b;

import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> lines;
	
	
	public Order(int orderNum, List<OrderLine> lines) throws Exception {
		super();
		this.orderNum = orderNum;
		this.lines = lines;
		if(lines.size()<1)
			throw new Exception("Each order at lease has 1 OrderLine");
		else
			System.out.println("New Order "+ orderNum + " is created with a default OrderLine " + lines);
	}
	
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public List<OrderLine> getOrderLines() {
		return lines;
	}
	public void setOrderLines(List<OrderLine> lines) {
		this.lines = lines;
	}


	@Override
	public String toString() {
		return "Order " + orderNum + "'s orderlines are [" + lines + " ]";
	}


	
	
}
