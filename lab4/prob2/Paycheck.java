package lab4.prob2;

public class Paycheck {
	
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	
	public void print(){
		System.out.println("After taxing: " + getNetPay());
	}
	
	
	public Paycheck(double gross) {
		grossPay = gross;
		fica = 0.23;
		state = 0.05;
		local = 0.01;
		medicare = 0.03;
		socialSecurity = 0.075;
	}


	public double getNetPay(){
		return grossPay*(1-fica-state-local-medicare-socialSecurity);
	}
}
