package lab5.prob4;

public final class PersonBirthRecordImpl implements PersonBirthRecord{
	private Person person;
	private BirthInfo birthInfo;
	
	PersonBirthRecordImpl(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}
	
	public Person getPerson() {
		return person;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
	

}
