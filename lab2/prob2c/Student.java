package lab2.prob2c;

import java.util.List;

public class Student {
	public String name;
	public List<Section> sections;

	public Student(String name, List<Section> sections) {
		super();
		this.name = name;
		this.sections = sections;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
