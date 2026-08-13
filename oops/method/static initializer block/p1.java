public class p1 {
    static {
        test();
        System.out.println("This is static block1!!!!");
    }
    public static void main(String[] args) {
        System.out.println("This is main method!!!!");
        test();
        System.out.println("---------------------");
        System.out.println("this is car method p2 is x : " + p2.x);
        System.out.println("---------------------");
        System.out.println("this is car method p2 is x : " + p2.x);
    }
    public static void test() {
        System.out.println("This is test method!!!!");
    }
    static {
        System.out.println("This is static block2!!!!");
    }
}
