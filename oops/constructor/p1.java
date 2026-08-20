package oops.constructor;

public class p1 {
    String name;
    int price;
    double weight;
    String color;

    p1() {
        System.out.println("p1 object");
    }

    public String toString() {

        return "Name is: " + name + "\tPrice is: " + price + "\tWeight is: " + weight+"\tColor is: " +color;
    }

    public String getDetails() {
        return "Name is: " + name + "\nPrice is: " + price + "\nWeight is: " + weight+"\nColor is: " +color;
    }
}
