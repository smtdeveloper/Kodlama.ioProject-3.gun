
public class Instructor extends User {

	private int salary;
	private int studentCount;
	private String ýban;
	
	public Instructor() {
		
	}
	
	public Instructor(int salary, int studentCount, String ýban) {
		super();
		this.salary = salary;
		this.studentCount = studentCount;
		this.ýban = ýban;
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
		return ýban;
	}
	public void setIban( String ýban ) {
		this.ýban = ýban;
	}
	
	
	public int getNetSalary() {
		
		return this.salary + ( this.studentCount * 10 );
	}
	
	
}
