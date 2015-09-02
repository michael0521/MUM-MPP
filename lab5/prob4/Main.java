package lab5.prob4;

public class Main {
	public static void main(String[] args) {
		PersonBirthRecord record = PersonBirthRecordFactory.createPersonBirth("michael", "1982");
		Person person = record.getPerson();
		System.out.println(person);
		BirthInfo birthday = record.getBirthInfo();
		System.out.println(birthday);
	}
}
