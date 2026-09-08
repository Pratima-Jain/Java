public class m2 {
// IO.readln(string prompt)
    public static void main(String[] args){
        String name = IO.readln("Enter the name: ");
        int age = Integer.parseInt(IO.readln("Enter the age: "));
        double weight = Double.parseDouble(IO.readln("Enter the weight: "));
        char gender = IO.readln("Enter the gender: ").charAt(0);
        String address = IO.readln("Enter the address: ");
        boolean isGraduate = Boolean.parseBoolean(IO.readln("Are you a Graduate: "));
        String city = IO.readln("Enter your city: ");
        String email = IO.readln("Enter email: ");

        IO.println("Name is : " + name);
        IO.println("Age is : " + age);
        IO.println("Gender is : " + gender);
        IO.println("Graduate?  " + isGraduate);
        IO.println("weight is : " + weight);
        IO.println("Address is : " + address); 
        IO.println("City is : " + city);
        IO.println("Email is : " + email);
    }
}

