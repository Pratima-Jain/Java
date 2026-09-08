package copyConstructor.shallow;

public class studentDriver {
    public static void main(String[] args) {

        student s1 = new student("Mohan", 101, new address("Noida", "UP", 201301));
        student s2 = new student("Sohan", 301, new address("Lucknow", "UP", 501301));

        student s3 = new student(s1);

        s3.a.city = "Kanpur";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
        System.out.println("================");
    }
}
