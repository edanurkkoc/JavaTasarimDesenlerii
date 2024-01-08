package factory;

interface Motor{
	public void calistir( );

}
interface Sanziman{
	public void sinifi_degistir();
	
}
interface Tekerlek{
	
	public void dondur();
}
interface Renk{
	public void doldur();
}
class UcSilindir implements Motor{

	@Override
	public void calistir() {
		// TODO Auto-generated method stub
		
	}
	
}

class DortSilindir implements Motor{

	@Override
	public void calistir() {
		// TODO Auto-generated method stub
		
	}
	
}
class OtomatikVites implements Sanziman{

	@Override
	public void sinifi_degistir() {
		// TODO Auto-generated method stub
		
	}
	
}
class DüzVites implements Sanziman{

	@Override
	public void sinifi_degistir() {
		// TODO Auto-generated method stub
		
	}
	
}

class Kirmizi implements Renk{

	@Override
	public void doldur() {
		// TODO Auto-generated method stub
		
	}
	
}
class Siyah implements Renk{

	@Override
	public void doldur() {
		// TODO Auto-generated method stub
		
	}
	
}
class Beyaz implements Renk{

	@Override
	public void doldur() {
		// TODO Auto-generated method stub
		
	}
	
}

class Kislastik implements Tekerlek{

	@Override
	public void dondur() {
		// TODO Auto-generated method stub
		
	}

	
}

class Yazlastik implements Tekerlek{

	@Override
	public void dondur() {
		// TODO Auto-generated method stub
		
	}

	
}








