package lab3.prob1;

public class PersonWithJob {
	private double salary;
	private Person person;

	public Person getPerson() {
		return person;
	}

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob) aPerson;
			return this.getPerson().equals(p.getPerson()) && this.getSalary() == p.getSalary();
		} else if (aPerson instanceof Person) {
			Person p = (Person) aPerson;
			return this.getPerson().equals(p);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
