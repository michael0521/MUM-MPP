package lab5.prob3;

public class Circle implements IComputeArea{
	
	private double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	double getRadius() {
		return radius;
	}


	@Override
	public double computeArea() {
		return Math.PI*radius*radius;
	}

}
