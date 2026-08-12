
import java.util.Scanner;

public class m7 {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(s2.nextLine());
        System.out.print("Enter the name: ");
        String name = s2.nextLine();
        System.out.print("Enter the weight: ");
        double weight = Double.parseDouble(s2.nextLine());
        System.out.print("Enter the address: ");
        String address = s2.nextLine();
        System.out.print("Are you a Graduate: ");
        boolean isGraduate = Boolean.parseBoolean(s2.nextLine());
        System.out.print("Enter your city: ");
        String city = s2.nextLine();
         System.out.print("Enter email: ");
        String email = s2.nextLine();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("weight is : " + weight);
        System.out.println("Address is : " + address); 
        System.out.println("City is : " + city);
        System.out.println("Email is : " + email);
    }
}