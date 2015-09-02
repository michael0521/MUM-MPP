package lab3.prob1;

public class Person {

	private String name;

	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (aPerson instanceof Person) {
			Person p = (Person) aPerson;
			return this.name.equals(p.name);
		}
		if (aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob) aPerson;
			return this.name.equals(p.getPerson().getName());
		}
		return false;
	}
	


	public static void main(String[] args) {

	}

}
