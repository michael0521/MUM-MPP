package lab5.prob2;

public class RedheadDuck extends Duck{
	
	
	public RedheadDuck() {
		super();
		fb = new FlyWithWings();
		qb = new Quack();
	}

	@Override
	void fly(){
		fb.fly();
	}

	@Override
	void quack() {
		qb.quack();
	}

}
