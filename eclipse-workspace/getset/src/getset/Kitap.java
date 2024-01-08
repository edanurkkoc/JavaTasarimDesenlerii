package getset;

public class Kitap {
//Fields
	public String Yazaradi;
	public String Kitapadi;
	public int Sayfasayisi;
	
	public Kitap(String yazaradi,String kitapadi,int sayfasayisi) {
		Yazaradi=yazaradi;
		Kitapadi=kitapadi;
		Sayfasayisi=sayfasayisi;
		
	}
	//Encapsulation:get and set method
	public int getSayfasayisi() {
		return Sayfasayisi;
	}
	public String getYazaradi() {
		return Yazaradi;
	}
	public String getKitapadi() {
		return Kitapadi;
	}
	
	public void setSayfasayisi(int sayfa) {
		if (sayfa<1) {
			System.out.println("Sayfa sayisi negatif olamaz :");
			sayfa=1;
		}
		else {
			Sayfasayisi=sayfa;
		}
	
	}
}
