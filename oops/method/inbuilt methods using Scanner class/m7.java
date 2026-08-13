import java.util.Scanner;
// parsing
public class m7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the weight: ");
        double weight = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        System.out.print("Are you a Graduate: ");
        boolean isGraduate = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("weight is : " + weight);
        System.out.println("Address is : " + address); 
        System.out.println("City is : " + city);
        System.out.println("Email is : " + email);
    }
}