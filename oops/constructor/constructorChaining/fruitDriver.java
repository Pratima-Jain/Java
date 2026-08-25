package constructorChaining;

public class fruitDriver {
    public static void main(String[] args) {
        fruit f1 = new fruit("Apple", 200, 3.4, "Red");
        fruit f2 = new fruit("Mango", 110, 2.5, "Yellow");
        fruit f3 = new fruit("Orange");
        fruit f4 = new fruit();
        fruit f5 = new fruit("Apple", 180);
        fruit f6 = new fruit(110, "Mango");
        fruit f7 = new fruit("Orange", 100, 3.3);
        fruit f8 = new fruit("Mango", 140, 4.6);
        fruit f9 = new fruit(3.8);
        fruit f10 = new fruit(7.2);

        System.out.println(f1.toString());
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);
        System.out.println(f9);
        System.out.println(f10);

        System.out.println("================");
    }
}
