
public class InstructorManager {

	public void getAll() {
		
		System.out.println("T�m E�itmenler, Ba�ar�l� Listelendi");
		
		}
	
	public void register(Instructor instructor) {
		System.out.println( " Ba�ar�l� kay�t " + 	 instructor.getFirstName() + " Hocam "  );
	}
	
	public void login(Instructor instructor) {
		System.out.println( "Ho�geldiniz " + 	 instructor.getFirstName() + " Hocam " );
	}
	
	public void exit(Instructor instructor) {
		System.out.println(  "��k�� yap�ld� " + instructor.getFirstName() + " Hocam " );
	}
	
}
