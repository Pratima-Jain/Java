import java.util.Scanner;
public class m5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Name is : " +name);
        System.out.println("Age is : " +age);        
    }
}