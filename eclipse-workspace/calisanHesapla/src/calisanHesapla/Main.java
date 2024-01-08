package calisanHesapla;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaasHesapla calc=new MaasHesapla();

Muhendis m=new Muhendis("EDİKO", 5, 10) ;
m.showInfos();
System.out.println("Sizin aylik ucretiniz :"+calc.hesapla(m));

Isci i=new Isci("sediko", 50, 120) ;
i.showInfos();
System.out.println("Sizin aylik ucretiniz :"+calc.hesapla(i));


	
}
}


