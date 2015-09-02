package lab2.prob2c;

import java.util.ArrayList;
import java.util.List;

public class Section {
	public int sectionNum;
	public List<Student> students;

	
	public Section(int sectionNum, Student student) throws Exception {
		super();
		this.sectionNum = sectionNum;
		students = new ArrayList<Student>();
		if(student != null){
			students.add(student);
			System.out.println("Section "+ sectionNum + " is created with a default student " + student);
		}else{
			throw new Exception("Section must have at least one student");
		}
	}

	public int getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Section [sectionNum=" + sectionNum + "]";
	}

	
	
}
