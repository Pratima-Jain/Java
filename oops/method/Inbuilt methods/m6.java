import java.util.Scanner;
// nextLine
public class m6{
    public static void main(String[] args){
        Scanner s6 = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(s6.nextLine());
        System.out.print("Enter the name: ");
        String name = s6.nextLine();
        System.out.println("Name is : " +name);
        System.out.println("Age is : " +age);        
    }
}