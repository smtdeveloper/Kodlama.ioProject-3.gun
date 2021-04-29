
public class UserManager {

	
	public void add( User[] user ) {
		
		System.out.println("Baþarýlý eklendi");
	}
	
	public void add( User user ) {
		
		System.out.println("Baþarýlý eklendi");
	}
	
	
	public void update(User[] user  ) {
		
		System.out.println("Baþarýlý Güncellendi");
	}
	public void update(User user  ) {
		
		System.out.println("Baþarýlý Güncellendi");
	}

	
	public void delete( User user  ) {
	
	System.out.println("Baþarýlý Silindi");
	}
	
	public void delete( User[] user  ) {
		
		System.out.println("Baþarýlý Silindi");
		}
		
	
	public void getAll( User[] user  ) {
		
		System.out.println("Tüm Kullanýcýlar, Baþarýlý Listelendi");
		
		}
	
	public void getAll( User user  ) {
		
		System.out.println("Tüm Kullanýcýlar, Baþarýlý Listelendi");
		
		}
	
}
