import java.util.Scanner;
// nextDouble + userinput
public class m3 {
	public static void main(String[] args){
		Scanner s3= new Scanner(System.in);
		System.out.print("Enter Number: ");
		double a = s3.nextDouble();
		double s = Even_Odd(a);
		System.out.print("Number is " + s);
    }
	public static double Even_Odd( double a){
		if(a%2==0){
			System.out.println("Even");		
		}else{
			System.out.println("Odd");	
		}
	return a ;
	}
}

