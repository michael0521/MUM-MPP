package lab2.prob2c;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		Student stu1 = new Student("Mike", new ArrayList<Section>());
		
		//Section s0 = new Section(29, null); throw at lease one student exception
		Section s1 = new Section(29, stu1);
		Section s2 = new Section(30, stu1);

		stu1.getSections().add(s1);
		stu1.getSections().add(s2);
		
		System.out.println(stu1 + " has sections " + stu1.sections);
		
		Student stu2 = new Student("Jerry", new ArrayList<Section>());
		s1.getStudents().add(stu2);		
		System.out.println("Section "+s1+ " is added a new student " + stu2.getName());
		
		System.out.println("" + s1 + " has students " + s1.students);
	}
}
