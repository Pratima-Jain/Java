package oops.constructor.constructorOverloading;

public class p1Driver {
    public static void main(String[] args) {
        p1 o1 = new p1("apple",1300,3.4,"blue");
        p1 o2 = new p1("guava",1000,3.7,"green");
        p1 o3 = new p1("orange");
        p1 o4 = new p1();
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

        System.out.println("---------------------------");

    }
}
