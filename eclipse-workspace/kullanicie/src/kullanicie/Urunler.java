package kullanicie;

public class Urunler {
	public String isim;
	public int fiyat;
	public int urun_adedi;
	public Urunler(String isim, int fiyat,int urun_adedi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.urun_adedi=urun_adedi;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public void setUrunadedi(int urun_adedi) {
		this.urun_adedi=urun_adedi;
	}
	public void getUrunadedi(int urun_adedi) {
		this.urun_adedi=urun_adedi;
	}

	

}
