import java.util.Scanner;
// nextLine
public class m6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Name is : " +name);
        System.out.println("Age is : " +age);        
    }
}