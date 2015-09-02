package lab4.prob2;

public class Hourly extends Employee {
	
	private double hourlyWage;
	private int hoursPerweek;

	
	public Hourly(int empId, double hourlyWage, int hoursPerweek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerweek = hoursPerweek;
	}


	@Override
	double calcGrossPay() {
		return hourlyWage*hoursPerweek*4;
	}

}
