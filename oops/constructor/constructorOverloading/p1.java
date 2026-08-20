package oops.constructor.constructorOverloading;

public class p1 {
    String name;
    int price;
    double weight;
    String color;

    p1() {
        System.out.println("p1 object");
    }

    p1(String name) {
        this.name = name;
    }

    p1(String name, int price, double weight, String color) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public String toString() {

        return "Name is: " + name + "\tPrice is: " + price + "\tWeight is: " + weight + "\tColor is: " + color;
    }

    public String getDetails() {
        return "Name is: " + name + "\nPrice is: " + price + "\nWeight is: " + weight + "\nColor is: " + color;
    }
}
