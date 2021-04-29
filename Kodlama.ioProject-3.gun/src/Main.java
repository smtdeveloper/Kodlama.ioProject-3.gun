import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" *************************** smtCODER ************************* ");
		System.out.println("Büyük Kampanya Tüm Kurslar 30 TL");
		System.out.println("");

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Samet");
		student1.setLastName("Akca");
		student1.setIdentityNumber("12345678911");
		student1.setEmail("sametakca@gmail.com");
		student1.setParola("12345");
		student1.setStudentNumber("186029045");
		student1.setCourseCount(2);
		

		Student student2 = new Student();
		student2.setId(1);
		student2.setFirstName("Ali");
		student2.setLastName("Casper");
		student2.setIdentityNumber("369852147");
		student2.setEmail("aliCasper@gmail.com");
		student2.setParola("12345");
		student2.setStudentNumber("186029046");
		student2.setCourseCount(1);
		
		
		System.out.println( student1.getFirstName() 
				+ " öğrecinin toplam ödeceyi ücret : " +  student1.getFee(student1) + " TL");
		
		System.out.println(  student2.getFirstName() 
		
				+ " öğrecinin toplam ödeceyi ücret : " +  student2.getFee(student1) + " TL");
		
		System.out.println("");
		System.out.println("------------------- Öğrencier --------------------- ");
		
		Student[] students = {student1 , student2 }; 
		
		for (Student student : students ) {
			
			System.out.println( "İsim : " + student.getFirstName());
			System.out.println( "Soy İsim :" + student.getLastName());
			System.out.println( "Tc No : " + student.getIdentityNumber());
			System.out.println( "Email : " + student.getEmail());
			System.out.println( "Parola :" + student.getParola());
			System.out.println( "Öğrenci no :" + student.getStudentNumber());
			System.out.println( "Kurs Sayısı : " + student.getCourseCount());
			System.out.println(" ----------------------------------------------" );
			
		}
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setIdentityNumber("12345678911");
		instructor1.setEmail("engin@engin.com");
		instructor1.setParola("12345");
		instructor1.setSalary(10000);
		instructor1.setStudentCount(2);
		instructor1.setIban("999999999999");
		
		
		System.out.println("");
		System.out.println("------------------- Eğitmenler --------------------- ");
		
		Instructor[] instructors = {instructor1 }; 
		
		for (Instructor instructor : instructors ) {
			
			System.out.println( "İsim : " + instructor.getFirstName());
			System.out.println( "Soy İsim :" + instructor.getLastName());
			System.out.println( "Tc No : " + instructor.getIdentityNumber());
			System.out.println( "Email : " + instructor.getEmail());
			System.out.println( "Parola :" + instructor.getParola());
			System.out.println( "Öğrenci Sayısı : " + instructor.getStudentCount());
			System.out.println( "Net Maaş : " + instructor.getNetSalary());
			System.out.println( "Iban : " + instructor.getIban());
			System.out.println(" ----------------------------------------------" );
			
		}
		
		System.out.println("");
		System.out.println("------------------- Kullanıcılar ( userManager ) --------------------- ");
		
		User[] users = {student1,student2,instructor1};
		
		UserManager userManager = new UserManager();
		userManager.add(users);
		userManager.update(users);
		userManager.delete(users);
	
		System.out.println("");
		System.out.println("------------------- Öğrencier (  StudentManager ) --------------------- ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		studentManager.login(student1);
		studentManager.exit(student1);
		
		
		System.out.println("");
		System.out.println("------------------- Eğitmenler  ( InstructorManager ) --------------------- ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(instructor1);
		instructorManager.login(instructor1);
		instructorManager.exit(instructor1);
		
	}

}

