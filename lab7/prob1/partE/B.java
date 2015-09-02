package lab7.prob1.partE;

interface B extends A {

	@Override
	public default void m1() {
		System.out.println("in B ...");

	}

}
