package oops.variables.task2;

public class p1 {
    public static void main(String[] args) {
        order o1 = new order();
        o1.setData(101, "Order1");
        o1.getData();
        user u1 = new user();
        u1.setData("Mohan", 20, 111);
        u1.getData();
        laptop l1 = new laptop();
        l1.setData("Dell", "Black", 50000);
        l1.getData();
        product p1 = new product();
        p1.setData("Pen", 10, "Blue");
        p1.getData();
    }
}
