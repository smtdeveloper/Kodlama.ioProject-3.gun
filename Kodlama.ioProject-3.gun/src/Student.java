
public class Student extends User {

	private String studentNumber;
	private int courseCount;
	
	
	public Student() {
		
	}
	
	public Student(String studentNumber,  String course, int courseCount) {
		super();
		this.studentNumber = studentNumber;
		this.courseCount = courseCount;
		
	}
	
	
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	public int getFee( Student student ) {
		
		return this.courseCount * 30;
	}
	
	
	
	public int getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
	
	
	
	
}
