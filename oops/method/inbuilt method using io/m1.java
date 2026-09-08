public class m1 {
// IO.readln()
    public static void main(String[] args){
        IO.print("Enter the name: ");
        String name = IO.readln();
        IO.print("Enter the age: ");
        int age = Integer.parseInt(IO.readln());
        IO.print("Enter the weight: ");
        double weight = Double.parseDouble(IO.readln());
        IO.print("Enter the address: ");
        String address = IO.readln();
        IO.print("Are you a Graduate: ");
        boolean isGraduate = Boolean.parseBoolean(IO.readln());
        IO.print("Enter your city: ");
        String city = IO.readln();
        IO.print("Enter email: ");
        String email = IO.readln();

        IO.println("Name is : " + name);
        IO.println("Age is : " + age);
        IO.println("weight is : " + weight);
        IO.println("Address is : " + address); 
        IO.println("City is : " + city);
        IO.println("Email is : " + email);
    }
}
