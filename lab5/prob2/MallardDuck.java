package lab5.prob2;

public class MallardDuck extends Duck{


	public MallardDuck() {
		fb = new FlyWithWings();
		qb = new Quack();
	}
	
	@Override
	public void fly(){
		fb.fly();
	}
	
	@Override
	public void quack(){
		qb.quack();
	}
	
}
