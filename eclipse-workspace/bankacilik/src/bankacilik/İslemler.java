package bankacilik;

public abstract class İslemler {
	public String  name;
	public String surname;
	public int kimlik_no;
	public int gonderilecek_miktar;
	abstract  void havale() ;
	abstract void eft();
	abstract void swift();
	abstract void hesapla();
	public int kalan_miktar;
	public int bakiye;
	public String islem_turu;
	
	
	public İslemler(String name, String surname, int kimlik_no, int gonderilecek_miktar,String islem_turu,int bakiye) {
		super();
		this.name = name;
		this.surname = surname;
		this.kimlik_no = kimlik_no;
		this.gonderilecek_miktar = gonderilecek_miktar;
		this.islem_turu=islem_turu;
		this.bakiye=bakiye;
	}
	public void ShowInfos() {
		System.out.println("Adiniz :"+this.name);
		System.out.println("Soyadiniz:"+this.surname);
		System.out.println("Kimlik umaraniz :"+this.kimlik_no);
		System.out.println("Gonderilecek miktar :"+this.gonderilecek_miktar);
		System.out.println("Islem turunuz  :"+this.islem_turu);
		System.out.println("Su anki bakiyeniz :"+this.bakiye);
		

	}
}

class Standart extends İslemler{
public Standart(String name, String surname, int kimlik_no, int gonderilecek_miktar,String islem_turu,int bakiye) {
		super(name, surname, kimlik_no, gonderilecek_miktar,islem_turu, bakiye);
		// TODO Auto-generated constructor stub
	}


@Override
void hesapla() {
	// TODO Auto-generated method stub
	
}

	@Override
	void havale() {
		// TODO Auto-generated method stub
	if (bakiye>gonderilecek_miktar) {
		System.out.println("Havale islemi ucretsizdir :");
		kalan_miktar=bakiye-gonderilecek_miktar;
		System.out.println("Kalan bakiyeniz :"+this.kalan_miktar);
		
	}
	else {
		System.out.println("Bu islem gerceklestirilemez :");
	}
		

		
		
	}

	@Override
	void eft() {
		
		// TODO Auto-generated method stub
		if (bakiye>gonderilecek_miktar) {
			kalan_miktar=bakiye-((((gonderilecek_miktar *5)/100))+20+gonderilecek_miktar);
			System.out.println("Kalan bakiyeniz :"+this.kalan_miktar);
			
		}
		else {
			System.out.println("Bu islem gonderilemez :");
		}
		
	}

	@Override
	void swift() {
		// TODO Auto-generated method stub
		System.out.println("Standart kullanicilar swift kullanamaz :"+this.bakiye);
		
	}
}

	

	
	

class Ozel extends İslemler{

	public Ozel(String name, String surname, int kimlik_no, int gonderilecek_miktar,String islem_turu,int bakiye) {
		super(name, surname, kimlik_no, gonderilecek_miktar,islem_turu, bakiye);
		// TODO Auto-generated constructor stub
	}

	@Override
	void havale() {
		// TODO Auto-generated method stub
		if (bakiye>gonderilecek_miktar) {
			System.out.println("Havale islemi ucretsizdir :");
			kalan_miktar=bakiye;
			System.out.println("Kalan bakiyeniz :"+this.kalan_miktar);
			
		}
		else {
			System.out.println("Bu islem gerceklestirilemez :");
		}
		
		
	}

	@Override
	void eft() {
		kalan_miktar=bakiye;
		// TODO Auto-generated method stub
		if (kalan_miktar>gonderilecek_miktar) {
			kalan_miktar=bakiye-(20);
			System.out.println("Kalan bakiyeniz :"+this.kalan_miktar);
			
		}
		else {
			System.out.println("Bu islem gonderilemez :");
		}
		
	}

	@Override
	void swift() {
		// TODO Auto-generated method stub
		if (bakiye>gonderilecek_miktar) {
			kalan_miktar=bakiye-(500+gonderilecek_miktar);
			System.out.println("Kalan bakiyeniz :"+this.kalan_miktar);
			
		}
		else {
			System.out.println("Bu islem gonderilemez :");
		}
	}

	@Override
	void hesapla() {
		// TODO Auto-generated method stub
		
	}
	
}













