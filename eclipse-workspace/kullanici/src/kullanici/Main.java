package kullanici;

//import interfaceler.DatabaseManager;
//import interfaceler.Student;

//import interfaceler.IDatabase;


public class Main {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
Kullanici sefa=new Kullanici();
sefa.setName(null);
sefa.setMail(null);

sefa.setAdres_fatura_il(null);
sefa.setAdres_fatura_ilce(null);

sefa.setAdres_kargo_il(null);
sefa.setAdres_kargo_ilce(null);*/
		
		Kullanici sefa=new Kullanici();
		sefa.setName(null);
		sefa.setMail(null);
		
		Adres adres=new Adres();
		adres.getil();
		adres.getIlce();
		
		
		sefa.setFatura(adres);
		sefa.setKargo(adres);
		//DatabaseManager database=new DatabaseManager();	
	}

}
