package calisanHesapla;
//ad,saatlikucret,aylıkcalısmasaati,
public class Calisan {

	public String ad;
	public int saatlik_ucret;
	public int aylik_calisma_saati;
	
	public int getSaat() {
		return aylik_calisma_saati;
	}
	public int getUcret() {
		return saatlik_ucret;
	}
	//Constructor
	public Calisan(String ad, int saatlik_ucret, int aylik_calisma_saati) {
		super();
		this.ad = ad;
		this.saatlik_ucret = saatlik_ucret;
		this.aylik_calisma_saati = aylik_calisma_saati;
		
	}
	public void showInfos(){
		System.out.println("Adiniz :"+this.ad);
		System.out.println("Saatlik ücretiniz:"+this.saatlik_ucret);
		System.out.println("Aylik calisma saatiniz:"+this.aylik_calisma_saati);

	}
	
}

class Muhendis extends Calisan {

	public Muhendis(String ad, int saatlik_ucret, int aylik_calisma_saati) {
		super(ad, saatlik_ucret, aylik_calisma_saati);
		// TODO Auto-generated constructor stub
	}	
}
class Isci extends Calisan {

	public Isci(String ad, int saatlik_ucret, int aylik_calisma_saati) {
		super(ad, saatlik_ucret, aylik_calisma_saati);
		// TODO Auto-generated constructor stub
	}	
}
class MaasHesapla{
	public int hesapla(Calisan c) {
		return c.getSaat()*c.getUcret();
	}
}



