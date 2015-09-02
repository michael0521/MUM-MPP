package lab7.prob2;

public class EquilateralTriangle implements ClosedCurve{
	private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}
	
	@Override
	public double[] getSides() {
		double[] sides = {side, side, side};
		return sides;
	}

}
