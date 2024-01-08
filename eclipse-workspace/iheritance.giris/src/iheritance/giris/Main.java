package iheritance.giris;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Bos Insan", "İssiz", 0);
		employee.showInfos();
		Manager manager=new Manager("Edanur Kocakoc", "Hayalperest", 2100);
		manager.showInfos();
	}

}
