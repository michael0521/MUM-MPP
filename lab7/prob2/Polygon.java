package lab7.prob2;

public interface Polygon {
	 
	 public abstract double[] getSides();
	 
	 default double computePerimeter(){
		 double perimeter = 0.0;
		 for(double s: getSides()){
			 perimeter += s;
		 }
		 return perimeter;
	 }
	 
}
