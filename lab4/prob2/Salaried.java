package lab4.prob2;

public class Salaried extends Employee {
	
	private double salary;

	
	public Salaried(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}


	@Override
	double calcGrossPay() {
		return salary;
	}

}
