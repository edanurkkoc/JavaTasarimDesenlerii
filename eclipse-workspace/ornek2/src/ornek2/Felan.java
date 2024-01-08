package ornek2;

//Bir abstract sınıf
abstract class AbstractClass {
 // Abstract method
 abstract void methodAbstract();
}

//Bir arayüz
interface InterfaceExample {
 void methodInterface();
}

//Hem abstract sınıftan hem de arayüzden miras alan sınıf
class MyClass extends AbstractClass implements InterfaceExample {
 // Abstract sınıftan gelen methodu uygula
 void methodAbstract() {
     System.out.println("Abstract method implementation");
 }

 // Arayüzden gelen methodu uygula
 public void methodInterface() {
     System.out.println("Interface method implementation");
 }

 // Kendi methodu
 void myMethod() {
     System.out.println("My method");
 }
}
