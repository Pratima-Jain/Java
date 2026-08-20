package callByValue;

public class emploDriver {
    public static void main(String[] args) {
        employ e1 = new employ();
        employ e2 = new employ();
        employ e3 = new employ();

        e1.setDetails(23, 20000);// Call by value
        e2.setDetails(21, 19000);
        e3.setDetails(25, 30000);

        System.out.println("Employ1 details: " + e1.getDetails());
        System.out.println("Employ2 details: " + e2.getDetails());
        System.out.println("Employ3 details: " + e3.getDetails());
    }
}
