package lab5.prob2;

abstract class Duck {
	protected QuackBehavior qb;
	protected FlyBehavior fb;
	
	
	public void swim(){
		System.out.println("swimming");
	}
	public void display(){
		System.out.println("displaying");
	}
	
	abstract void fly();
	
	abstract void quack();
}
