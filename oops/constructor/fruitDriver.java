// package oops.constructor;

public class fruitDriver {
    public static void main(String[] args) {
        fruit o1 = new fruit();
        fruit o2 = new fruit();
        fruit o3 = new fruit();
        fruit o4 = new fruit();
        System.out.println(o1.toString());
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);

        System.out.println("---------------------------");

        System.out.println(o1.getDetails());
		System.out.println(o2.getDetails());
		System.out.println(o3.getDetails());
		System.out.println(o4.getDetails());
    }
}
