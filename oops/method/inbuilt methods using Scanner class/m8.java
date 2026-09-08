import java.util.Scanner;
// character ---> nextLine().charAt()
public class m8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        char c = sc.nextLine().charAt(4);
        System.out.print("Character is: "+c);
    }
}
