package lab2.prob2b;

public class OrderLine {
	private int lineNum;
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderLine(int lineNum) {
		super();
		this.lineNum = lineNum;
	}

	@Override
	public String toString() {
		return "OrderLine [lineNum=" + lineNum + "]";
	}

	
}
