package facade;

public class CrediCartFacade {
public void createCrediCart(Musteri musteri) {
	CrediCartManager crediCartManager=new CrediCartManager();
	BlackListService blackListService=new BlackListService();
	
	if (!blackListService.checkEmployeeBlackList(musteri)) {
		crediCartManager.createCredicart(musteri);
		
	}
	
}
}
