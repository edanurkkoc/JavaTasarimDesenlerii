package facade;

public class Testamafacade {
	public static void main() {
		
		Musteri eda=new Musteri("Eda", "filan");
		CrediCartFacade crediCartFacade=new CrediCartFacade();
		crediCartFacade.createCrediCart(eda);
		System.out.println(eda.getAd());
		System.out.println(eda);
		System.out.println("kdedkmk");
}
	}
