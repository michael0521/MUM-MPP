package lab5.prob4;

public class PersonBirthRecordFactory {

	private PersonBirthRecordFactory() {
		
	}
	
	public static PersonBirthRecord createPersonBirth(String name, String birthday){
		Person person = new Person(name);
		BirthInfo birthInfo = new BirthInfo(birthday);
		person.setBirthInfo(birthInfo);
		birthInfo.setPerson(person);
		return new PersonBirthRecordImpl(person, birthInfo);
	}
}
