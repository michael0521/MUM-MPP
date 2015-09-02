package lab7.prob5;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Cannot quarck");
	}

}
