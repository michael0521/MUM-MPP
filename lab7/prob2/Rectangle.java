package lab7.prob2;

public class Rectangle implements ClosedCurve {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	

	@Override
	public double[] getSides() {
		double[] sides = {length, width, length, width};
		return sides;
	}
}
