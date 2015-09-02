package lab2.prob2a;

public class Student {
	private String name;



	private GradeReport gradeReport;
	
	public Student(String name, GradeReport gradeReport) {
		this.name = name;
		this.gradeReport = gradeReport;
	}

	
	public GradeReport getGradeReport() {
		return gradeReport;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name +"]";
	}
	
	
}
