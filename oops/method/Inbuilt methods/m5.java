import java.util.Scanner;
public class m5{
    public static void main(String[] args){
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = s2.nextLine();
        System.out.print("Enter the age: ");
        int age = s2.nextInt();
        System.out.println("Name is : " +name);
        System.out.println("Age is : " +age);        
    }
}