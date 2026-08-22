package oops.printMethod;

public class fruitDriver {
    	public static void main(String[] args){

		fruit f1=new fruit();
		fruit f2=new fruit();
		fruit f3=new fruit();
	
		fruit.brand="TATA";

		f1.name="Mango";
		f1.price=100;
		f1.weight=3.7;
		f2.name="Apple";
		f2.price=280;
		f2.weight=1.9;

		System.out.println("====Fruit1 details=======");
		f1.printDetails();
		f1.printTotalPrice();
		System.out.println("====Fruit2 details=======");
		f2.printDetails();
		f2.printTotalPrice();
		System.out.println("====Fruit3 details=======");
		f3.printDetails();
		f3.printTotalPrice();
	}
}
