package oops.printMethod;

public class fruit {
    	static String brand;
	String name;
	int price;
	double weight;


	public void printTotalPrice(){
		double totalPrice=price*weight;
		System.out.println("Total Price is: "+totalPrice);

	}
	public void printDetails(){
		System.out.println("Brand is: "+brand);
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
	}
}
