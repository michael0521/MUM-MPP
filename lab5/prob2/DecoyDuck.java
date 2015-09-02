package lab5.prob2;

public class DecoyDuck extends Duck{
	

	public DecoyDuck() {
		fb = new CannotFly();
		qb = new MuteQuack();
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
