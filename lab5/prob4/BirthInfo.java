package lab5.prob4;

public final class BirthInfo {
	private String birthday;
	private Person person;

	BirthInfo(String birthday) {
		this.birthday = birthday;
	}

	void setPerson(Person person) {
		this.person = person;
	}

	public String getBirthday() {
		return birthday;
	}

	@Override
	public String toString() {
		return "BirthInfo [birthday=" + birthday + ", person=" + person.getName() + "]";
	}
	
	
}
