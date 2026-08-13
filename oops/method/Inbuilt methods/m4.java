import java.util.Scanner;
// nextInt + userinput
public class m4 {
    	public static void main(String[] args){
		Scanner s4= new Scanner(System.in);
		System.out.print("Check if the number is even : ");
		int a = s4.nextInt();
		boolean s = Even_Odd(a);
		System.out.print("Number is " + s);
    }
	public static boolean Even_Odd( int a){
		if (a%2==0){
			return true;	
		}else{
			return false;
		}
	}
}
