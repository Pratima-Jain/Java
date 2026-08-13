import java.util.Scanner;
// nextDouble
class m2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number a: ");
		double a=sc.nextDouble();
		System.out.print("Enter Number b: ");
		double b=sc.nextDouble();
		double c=a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+c);			
	}
}