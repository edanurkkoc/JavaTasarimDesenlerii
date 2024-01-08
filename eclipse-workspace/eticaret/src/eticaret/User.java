package eticaret;

//import java.security.PublicKey;
import java.util.ArrayList;

//import eticaret.Urun.Sepet;

public abstract class User {
	private Sepet sepet;
	
	
	public Sepet getSepet() {
		return sepet;
	}

	public void setSepet(Sepet sepet) {
		this.sepet = sepet;
	}
	public User() {
		sepet=new Sepet();	}
public abstract double indirimHesapla(double toplamfiyat);


 class Standart extends User{
	 public double indirimHesapla(double fiyat) {
		 return fiyat;
	 }
 }


	 
 }
 class Premium extends User{
	 public double indirimHesapla(double fiyat) {
		 return fiyat*0.9;
	 }
	 
 }
 class Urun{
	 private String isim;
	 private double fiyat;
	public Urun(String isim, double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
 }
	 class Sepet{
		 
		 private ArrayList<Urun> urunler;
		 public Sepet() {
			 urunler=new ArrayList<Urun>();
			 
		 }
		 
		 public void urunEkle(Urun urun) {
			 urunler.add(urun);
		 }
		public void urunCiikar(Urun urun) {
			urunler.remove(urun);
		}
		public ArrayList<Urun> getUrunler(){
			return urunler;
		}
		 
	 }
	 class Odeme{
		 
		public void odemeYap(User user) {
			double toplamfiyat=0;
			
			for(Urun urun:user.getSepet().getUrunler()) {
				toplamfiyat+=urun.getFiyat();
			}
			toplamfiyat=user.indirimHesapla(toplamfiyat);
			System.out.println(toplamfiyat);
		}
		 
	 
	 }
	
	 
 