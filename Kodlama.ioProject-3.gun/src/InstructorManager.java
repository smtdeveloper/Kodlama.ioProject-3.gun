
public class InstructorManager {

	public void getAll() {
		
		System.out.println("Tüm Eðitmenler, Baþarýlý Listelendi");
		
		}
	
	public void register(Instructor instructor) {
		System.out.println( " Baþarýlý kayýt " + 	 instructor.getFirstName() + " Hocam "  );
	}
	
	public void login(Instructor instructor) {
		System.out.println( "Hoþgeldiniz " + 	 instructor.getFirstName() + " Hocam " );
	}
	
	public void exit(Instructor instructor) {
		System.out.println(  "Çýkýþ yapýldý " + instructor.getFirstName() + " Hocam " );
	}
	
}
