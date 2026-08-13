public class p1 {
    static {
        test();
        System.out.println("This is static block1!!!!");
    }
    public static void main(String[] args) {
        System.out.println("This is main method!!!!");
        test();
    }
    public static void test() {
        System.out.println("This is test method!!!!");
    }
    static {
        System.out.println("This is static block2!!!!");
    }
}
