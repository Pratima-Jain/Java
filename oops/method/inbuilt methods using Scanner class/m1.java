import java.util.Scanner;
// nextInt
public class m1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        
        int c = a+b;
        System.out.println("the sum of "+a+" and "+b+" is " + c);
    }
}
