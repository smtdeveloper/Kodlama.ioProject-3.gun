
public class UserManager {

	
	public void add( User[] user ) {
		
		System.out.println("Ba�ar�l� eklendi");
	}
	
	public void add( User user ) {
		
		System.out.println("Ba�ar�l� eklendi");
	}
	
	
	public void update(User[] user  ) {
		
		System.out.println("Ba�ar�l� G�ncellendi");
	}
	public void update(User user  ) {
		
		System.out.println("Ba�ar�l� G�ncellendi");
	}

	
	public void delete( User user  ) {
	
	System.out.println("Ba�ar�l� Silindi");
	}
	
	public void delete( User[] user  ) {
		
		System.out.println("Ba�ar�l� Silindi");
		}
		
	
	public void getAll( User[] user  ) {
		
		System.out.println("T�m Kullan�c�lar, Ba�ar�l� Listelendi");
		
		}
	
	public void getAll( User user  ) {
		
		System.out.println("T�m Kullan�c�lar, Ba�ar�l� Listelendi");
		
		}
	
}
