//ikisinin de toplam varlıkları tl olarak gösterilmelidir
//havale,eft,swift
//havale ucretsiz
//eft özel kullanıcılar icin 20tl,standart için en az 20 tl olmak sartıyla yüzde 5 oranında belirlendi
//standartlar swift yapamaz ,özell 500 öder
//kullanıcıların toplam varlığı gönderilen miktar ve islem bedelinden fazla ise işlem gerçekleştirilir
//islem basarılı olursa gönderilen iktar ve işlem bedeli bakiyeden düşer
package bankacilik;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Standart standart=new Standart("Eda", "Felan",413225678, 300, "eft", 400);
standart.ShowInfos();
standart.eft();
//standart.swift();


Ozel ozel=new Ozel("Eda", "Felan",413225678, 300, "eft", 400);
ozel.ShowInfos();
ozel.eft();
//ozel.swift();

//standart.eft();
//standart.eft();
	}

}
