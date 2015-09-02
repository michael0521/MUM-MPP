package lab7.prob5;

interface Duck {
	
	FlyBehavior fb = new FlyWithWings();
	QuackBehavior qb = new Quack();
	
	public default void swim(){
		System.out.println("swimming");
	}
	public default void display(){
		System.out.println("displaying");
	}

	public default void fly(){
		fb.fly();
	}
	public default void quack() {
		qb.quack();
	}
}
