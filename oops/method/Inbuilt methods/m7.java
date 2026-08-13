import java.util.Scanner;
// parsing
public class m7 {
    public static void main(String[] args) {
        Scanner s7 = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(s7.nextLine());
        System.out.print("Enter the name: ");
        String name = s7.nextLine();
        System.out.print("Enter the weight: ");
        double weight = Double.parseDouble(s7.nextLine());
        System.out.print("Enter the address: ");
        String address = s7.nextLine();
        System.out.print("Are you a Graduate: ");
        boolean isGraduate = Boolean.parseBoolean(s7.nextLine());
        System.out.print("Enter your city: ");
        String city = s7.nextLine();
        System.out.print("Enter email: ");
        String email = s7.nextLine();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("weight is : " + weight);
        System.out.println("Address is : " + address); 
        System.out.println("City is : " + city);
        System.out.println("Email is : " + email);
    }
}