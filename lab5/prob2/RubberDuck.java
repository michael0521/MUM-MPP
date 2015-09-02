package lab5.prob2;

public class RubberDuck extends Duck{

	public RubberDuck() {
		fb = new CannotFly();
		qb = new Squeak();
	}

	@Override
	void fly() {
		fb.fly();
		
	}

	@Override
	void quack() {
		qb.quack();
	}

	
}
