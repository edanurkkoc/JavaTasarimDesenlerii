package kitap;
//class
public class Kitap {
//attirubes	
	public int Sayfa_sayisi;
	public String Kitap_adi,yazar;
//constructor
	Kitap(int Sayfa_sayisi,String Kitap_adi,String yazar) {
		this.Sayfa_sayisi=Sayfa_sayisi;
		this.Kitap_adi=Kitap_adi;
		this.yazar=yazar;
		
	}
	public int getSayfa_sayisi() {
		return Sayfa_sayisi;
	}
	public void setSayfa_sayisi(int sayfa_sayisi) {
		Sayfa_sayisi = sayfa_sayisi;
	}
	public String getKitap_adi() {
		return Kitap_adi;
	}
	public void setKitap_adi(String kitap_adi) {
		Kitap_adi = kitap_adi;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

}
