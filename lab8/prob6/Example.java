package lab8.prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;


public class Example {
	public static void main(String[] args) {
		
		evaluator();
	}

	static void evaluator() {
		Employee emp = new Employee("michael", 3000);
		Employee emp1 = new Employee("michael", 5000);
		EmployeeNameComparator comp = new EmployeeNameComparator();
		
		//A.
		Function<Employee, String> fa1 = (Employee e) -> e.getName();
		Function<Employee, String> fa2 = Employee::getName;
		System.out.println(fa2.apply(emp));
		
		//B.
		BiConsumer<Employee, String> bb1 = (Employee e, String s) -> e.setName(s);
		BiConsumer<Employee, String> bb2 = Employee::setName;
		bb2.accept(emp, "tina");
		System.out.println(emp.getName());
		
		//C.
		BiFunction<String, String, Integer> bfc1 = (String s1, String s2) -> s1.compareTo(s2);
		BiFunction<String, String, Integer> bfc2 = String::compareTo;
		System.out.println(bfc2.apply("tina", "mike"));
		
		//D.
		BiFunction<Double, Double, Double> bfd1 = (Double x, Double y) -> Math.pow(x, y);
		BiFunction<Double, Double, Double> bfd2 = Math::pow;
		System.out.println(bfd2.apply(2.0, 4.0));
		
		//E
		Function<Apple, Double> fe1 = (Apple a) -> a.getWeight();
		Function<Apple, Double> fe2 = Apple::getWeight;
		Example.Apple apple = new Apple(30);
		System.out.println(fe2.apply(apple));
		
		//F
		Function<String, Integer> ff1 = (String x) -> Integer.parseInt(x);
		Function<String, Integer> ff2 = Integer::parseInt;
		System.out.println(ff2.apply("23"));
		
		//G
		BiFunction<Employee, Employee, Integer> bfg1 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
		BiFunction<Employee, Employee, Integer> bfg2 = comp::compare;
		System.out.println(bfg2.apply(emp, emp1));
	}
	
	static class Apple {
		private double weight;
		Apple(double weight) {
			this.weight = weight;
			
		}

		public double getWeight() {
			return weight;
		}
	}
}
