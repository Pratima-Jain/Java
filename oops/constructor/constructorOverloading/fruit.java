package oops.constructor.constructorOverloading;

public class fruit {
    String name;
    int price;
    double weight;
    String color;

    fruit() {
        System.out.println("p1 object");
    }

    fruit(String name) {
        this.name = name;
    }

    fruit(String name, int price, double weight, String color) {
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
