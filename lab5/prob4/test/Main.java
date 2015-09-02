package lab5.prob4.test;

import lab5.prob4.BirthInfo;
import lab5.prob4.Person;
import lab5.prob4.PersonBirthRecord;
import lab5.prob4.PersonBirthRecordFactory;

public class Main {
	public static void main(String[] args) {
		PersonBirthRecord record = PersonBirthRecordFactory.createPersonBirth("michael", "1982");
		Person person = record.getPerson();
		System.out.println(person);
		BirthInfo birthday = record.getBirthInfo();
		System.out.println(birthday);
	}

}
