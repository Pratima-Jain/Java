package oops.constructor.constructorOverloading;

public class fruitDriver {
    public static void main(String[] args) {
        fruit o1 = new fruit("apple",1300,3.4,"blue");
        fruit o2 = new fruit("guava",1000,3.7,"green");
        fruit o3 = new fruit("orange");
        fruit o4 = new fruit();
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

        System.out.println("---------------------------");

    }
}
