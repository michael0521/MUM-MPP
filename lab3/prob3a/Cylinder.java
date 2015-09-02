package lab3.prob3a;

public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {
	}

	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight(){
		return height;		
	}
	
	public double getVolume() {
		return Math.PI*Math.pow(getRadius(), 2)*height;
	}
	
}
