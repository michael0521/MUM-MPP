package lab4.prob2;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
	
	private List<Order> orders;
	private double commission;
	private double baseSalary;


	public Commissioned(int empId, List<Order> orders, double commission,
			double baseSalary) {
		super(empId);
		this.orders = orders;
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	@Override
	public Paycheck calcCompensation(int month, int year){
		
		double gross = calcGrossPay();
		LocalDate givenMonth = LocalDate.of(year, month, 29);
		for (Order order : orders) {
			if(givenMonth != order.getOrderDate())
				gross -= order.getOrderAmount()*commission;
		}		
		Paycheck check = new Paycheck(gross);
		return check;
	}
	
	@Override
	double calcGrossPay() {
		double sum = baseSalary;
		for (Order order : orders) {
			sum += order.getOrderAmount()*commission;
		}
		return sum;
	}

}
