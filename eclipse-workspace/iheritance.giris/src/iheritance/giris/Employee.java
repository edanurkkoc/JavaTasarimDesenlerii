package iheritance.giris;

public class Employee {
	private String name;
	private String department;
	private int salary;
	
	public Employee(String name, String department, int salary) {
		
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	//Employee classa bir tane metod yani fonk yazıyoruz
	public void showInfos() {
		System.out.println("Bilgiler...");
		System.out.println("İsim :"+this.name);
		System.out.println("Departman :"+this.department);
		System.out.println("Maas : "+this.salary);
	}
}
