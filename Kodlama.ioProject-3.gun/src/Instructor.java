
public class Instructor extends User {

	private int salary;
	private int studentCount;
	private String �ban;
	
	public Instructor() {
		
	}
	
	public Instructor(int salary, int studentCount, String �ban) {
		super();
		this.salary = salary;
		this.studentCount = studentCount;
		this.�ban = �ban;
	}

	
	
	
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	
	public String getIban() {
		return �ban;
	}
	public void setIban( String �ban ) {
		this.�ban = �ban;
	}
	
	
	public int getNetSalary() {
		
		return this.salary + ( this.studentCount * 10 );
	}
	
	
}
