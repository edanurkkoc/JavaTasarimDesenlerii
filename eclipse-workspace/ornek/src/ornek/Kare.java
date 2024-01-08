package ornek;


public class Kare extends Info{
	
public Kare(int kenar) {
	super(kenar);
}
	@Override
	public void hesapla() {
		// TODO Auto-generated method stub
	int alan=kenar*kenar;
	System.out.println("Alan = " + alan);
	}
	
}