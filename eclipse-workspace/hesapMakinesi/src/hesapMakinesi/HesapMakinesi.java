/*//switch-case ,if-else
package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Yapacaginiz islemi giriniz :");
int toplama=1,carpma=2,bolme=3,cikarma=4;

double a,b;
Scanner input=new Scanner(System.in);
int islem=input.nextInt();

System.out.print("a  degerini griniz :");
a=input.nextInt();

System.out.print("b  degerini griniz :");
b=input.nextInt();


switch (islem) {
case "toplama": {
	System.out.println("Toplama islemi sonucu :"+sonuc_toplama);
	
}
break;
case "cikarma":{
	System.out.println("Cikarma islemi sonucu :"+sonuc_cikarma);

}
break;
case "carpma":{
	System.out.println("Carpma islemi sonucu :"+sonuc_carpma);

	
}
break;
case "bolme":{
	System.out.println("Bolme islemi sonucu :"+sonuc_bolme);

}
break;
default:	
	System.out.println("Lütfen bir islem seciniz :");
}

if (islem==1) {
	double sonuc_toplama=a+b;
	System.out.println("Toplama islemi sonucu :"+sonuc_toplama);

}
else if(islem==2) {
	double sonuc_cikarma=a-b;
	System.out.println("Cikarma islemi sonucu :"+sonuc_cikarma);

}
else if(islem==3) {
	double sonuc_carpma=a*b;
	System.out.println("Carpma islemi sonucu :"+sonuc_carpma);

}
else if (islem==4) {
	if(b>0) {
	double sonuc_bolme=a/b;
	System.out.println("Bolme islemi sonucu :"+sonuc_bolme);
	}
	else {
		System.out.println("b sayisi 0'dan buyuk olmalıdır,bolum 0 olamaz :");
	}
}
else {
	System.out.print("4 islemden birini giriniz :");
}

	}
}
*/
