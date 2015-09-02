package lab2.prob2a;

public class GradeReport {
	private String reportNum;
	private Student student;

	public GradeReport(String report) {
		super();
		this.reportNum = report;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public Student getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "GradeReport [reportNum=" + reportNum + "]";
	}
	
	

}
