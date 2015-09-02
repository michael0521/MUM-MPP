package lab5.prob3;

public class Rectangle implements IComputeArea{
	
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	double getWidth() {
		return width;
	}

	double getLength() {
		return length;
	}

	@Override
	public double computeArea() {
		return width*length;
	}

}
