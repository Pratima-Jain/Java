package oops.variable_shadowing;

public class p1 {
    int x = 10;

    public void test() {
        System.out.println("Test method!");
        int x = 40;
        System.out.println(x);
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        p1 p = new p1();
        p.test();
    }

}
