package lab4.prob2;


public abstract class Employee {
	private int empId;
	public void print(){
		System.out.println("EmployeeID " + empId + " paycheck is as below:");

	}


	public Employee(int empId) {
		this.empId = empId;
	}


	public Paycheck calcCompensation(int month, int year){
		
		double gross = calcGrossPay();
		Paycheck check = new Paycheck(gross);
		return check;
	}
	
	abstract double calcGrossPay();

	
	
}
