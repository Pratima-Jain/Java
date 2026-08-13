import java.util.Scanner;
public class m5{
    public static void main(String[] args){
        Scanner s5 = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = s5.nextLine();
        System.out.print("Enter the age: ");
        int age = s5.nextInt();
        System.out.println("Name is : " +name);
        System.out.println("Age is : " +age);        
    }
}