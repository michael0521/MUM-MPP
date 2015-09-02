package lab5.prob4;


public final class Person {
	
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthInfo=" + birthInfo.getBirthday() + "]";
	}
	
	

}
