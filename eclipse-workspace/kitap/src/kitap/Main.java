package kitap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kitap sınıfınfan bir nsne oluşturdum
		Kitap kitap=new Kitap(10, "", "");
		//get ve set metodlarını çağırmazsan nesne tek başına anlamsız bir ıktı döndürür
		//System.out.println("eda"+kitap);
		kitap.getSayfa_sayisi();
        System.out.println("Sayfa Sayısı: " + kitap.getSayfa_sayisi());

		

	}

}