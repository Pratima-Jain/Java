package oops.variable_shadowing;

public class car {
    static int x = 10;

    public static void test() {
        System.out.println("this is test method");
        int x = 40;
        System.out.println(x);
        System.out.println(car.x);

    }

    public static void main(String[] args) {
        test();
    }
}
