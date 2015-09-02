package lab7.prob5;

public class DecoyDuck implements Duck {

	FlyBehavior fb = null;
	QuackBehavior qb = null;

	public DecoyDuck() {
		fb = new CannotFly();
		qb = new MuteQuack();
	}

	@Override
	public void fly() {
		fb.fly();
	}

	@Override
	public void quack() {
		qb.quack();
	}

}
