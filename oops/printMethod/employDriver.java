package oops.printMethod;

public class employDriver {
    	public static void main(String[] args){
		employ e1=new employ();
		employ e2=new employ();
		employ e3=new employ();
		
		e1.name="Mohan";
		e1.salary=23000;
		e1.age=26;
		e2.name="Sohan";
		e2.salary=18000;
		e2.age=23;
		e3.name="Rohan";
		e3.salary=38000;
		e3.age=32;

		e1.printDetails();
		e2.printDetails();
		e3.printDetails();

	}
}
