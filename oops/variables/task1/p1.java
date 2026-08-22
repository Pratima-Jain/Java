package oops.variables.task1;

public class p1 {
    public static void main(String[] args) {

        animal a1 = new animal();
        // product p1 = new product();
        // user u1 = new user();

        a1.name = "Lion";
        a1.age = 5;
        a1.color = "brown";
        a1.weight = 555;

        // p1.name = "Pen";
        // p1.id = 10;
        // p1.color = "Blue";

        // u1.name = "Mohan";
        // u1.age = 20;
        // u1.id = 111;

        // System.out.println("============PRODUCT============");
        // System.out.println(p1.name);
        // System.out.println(p1.id);
        // System.out.println(p1.color);
        // System.out.println("============USER============");
        // System.out.println(u1.name);
        // System.out.println(u1.age);
        // System.out.println(u1.id);
        // a1.setData("Lion", 5,"Brown");
        // a1.getData();

        a1.printTotalWeight();

    }

}
