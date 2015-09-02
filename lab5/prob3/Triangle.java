package lab5.prob3;

public class Triangle implements IComputeArea{

	private double base;
	private double height;


	public Triangle(double bottom, double height) {
		this.base = bottom;
		this.height = height;
	}
	
	public double getBottom() {
		return base;
	}


	public double getHeight() {
		return height;
	}


	@Override
	public double computeArea() {
		return base*height*1/2;
	}

}
