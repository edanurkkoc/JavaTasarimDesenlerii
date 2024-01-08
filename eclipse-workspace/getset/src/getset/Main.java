package getset;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitap k =new Kitap("Erenchan", "Ask ve Gurur", 1000);
		k.getKitapadi();
		k.getSayfasayisi();
		k.getYazaradi();
		
		k.setSayfasayisi(-1);
		System.out.println("Gonlumun Yazari :"+k.getYazaradi());

		System.out.println("Seni ne kadar seviyorum :"+"Sonsuz "+k.getSayfasayisi()+" kezzz");
		
	}

}
