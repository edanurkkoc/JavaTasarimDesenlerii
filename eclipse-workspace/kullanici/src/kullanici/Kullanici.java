package kullanici;
//Bir kullanıcı sınıfı tanımla(yas,isim,soyisim vs),
//giris al,mail, gon
//değişime açık gelişmeye kapalı 
public class Kullanici {

	private String name;
	private String mail;
	private String dogumTarihi;

	private Adres fatura;
	private Adres kargo;
	//set and get
	public Adres getKargo() {
		return kargo;
	}
	public void setKargo(Adres kargo) {
		this.kargo = kargo;
	}
	public Adres getFatura() {
		return fatura;
	}
	public void setFatura(Adres fatura) {
		this.fatura = fatura;
	}
	
	
	
	/*
	public String adres_fatura_il;
	private String adres_fatura_ilce;
	
	public String adres_kargo_il;
	private String adres_kargo_ilce;
	
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

/*
	public String getAdres_fatura_il() {
		return adres_fatura_il;
	}
	public void setAdres_fatura_il(String adres_fatura_il) {
		this.adres_fatura_il = adres_fatura_il;
	}
	public String getAdres_fatura_ilce() {
		return adres_fatura_ilce;
	}
	public void setAdres_fatura_ilce(String adres_fatura_ilce) {
		this.adres_fatura_ilce = adres_fatura_ilce;
	}
	public String getAdres_kargo_il() {
		return adres_kargo_il;
	}
	public void setAdres_kargo_il(String adres_kargo_il) {
		this.adres_kargo_il = adres_kargo_il;
	}
	public String getAdres_kargo_ilce() {
		return adres_kargo_ilce;
	}
	public void setAdres_kargo_ilce(String adres_kargo_ilce) {
		this.adres_kargo_ilce = adres_kargo_ilce;
	}
	*/
	

	
}
