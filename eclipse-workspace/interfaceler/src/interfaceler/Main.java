package interfaceler;

class DatabaseManager {
	public void LogDatabase(IDatabase database) {
		database.log();
	}
	public void GetDatabase(IDatabase database) {
		database.get();
	}
	public void  SetDatabase(IDatabase database) {
		database.set();
	}
	public void UpDatabase(IDatabase database) {
		database.update();
	}
	public void DeleteDatabase(IDatabase database) {
		database.delete();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interfacede object olusturamayiz
		//IDatabase b =new IDatabase(); 
		/*IDatabase database1=new Customer();
		database1.log();
		
		IDatabase database2=new Student();
		database2.log();
		
		Customer c=new Customer();
		c.log();
		
		Student s=new Student();
		s.log();*/
		DatabaseManager database=new DatabaseManager();	
		database.LogDatabase(new Student());
}
}
