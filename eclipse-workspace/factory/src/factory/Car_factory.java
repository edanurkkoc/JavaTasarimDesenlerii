//Factory design pattern’de tek bir ürün ailesine ait tek bir arayüz mevcutken,
//abstract factory’de farklı ürün aileleri için farklı arayüzler mevcuttur.
//istemcinin bir sınıfa olan baglılıgını azaltır,
//Abstract Factory ve Factory Method tasarım desenleri arasındaki ana fark, ilk olanın ilişkili nesnelerin bir grubunu oluşturma yolunu sunması iken, 
//diğerinin tek bir belirli nesne oluşturma odaklı olduğudur.
package factory;

public abstract class Car_factory {
private Motor motor; 
private Sanziman sanziman;
private Renk renk;
private Tekerlek tekerlek;
	
public abstract void createMotor();
public abstract void createSanziman();
public abstract void createRenk();
public abstract void createTekerlek();

public Motor getMotor() {
	return motor;
}
public void setMotor(Motor motor) {
	this.motor = motor;
}
public Sanziman getSanziman() {
	return sanziman; 
}
public void setSanziman(Sanziman sanziman) {
	this.sanziman = sanziman;
}
public Renk getRenk() {
	return renk;
}
public void setRenk(Renk renk) {
	this.renk = renk;
}
public Tekerlek getTekerlek() {
	return tekerlek;
}
public void setTekerlek(Tekerlek tekerlek) {
	this.tekerlek = tekerlek;
}
	
}

class Amodel extends Car_factory{

	@Override
	public void createMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createSanziman() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createRenk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createTekerlek() {
		// TODO Auto-generated method stub
		
	}
	
}














