package kullanicie;

abstract class Hesapla extends Urunler{
public int toplam;
	public Hesapla(String isim, int fiyat, int urun_adedi) {
		super(isim, fiyat, urun_adedi);
		// TODO Auto-generated constructor stub
		toplam=urun_adedi*fiyat;
		
	}

	
	

}
