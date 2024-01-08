package interfaceler;

public class Student implements IDatabase{

	@Override
	public void log() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci eklendi :");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci geldi :");
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci kuruldu :");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci guncellendi :");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci silindi :");
	}

}
