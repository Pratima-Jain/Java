package oops.constructor.constructorChaining;

public class fruit {
    String name;
    int price;
    double weight;
    String color;

    fruit() {
    }

    fruit(String name) {
        this.name = name;
    }

    fruit(int price) {
        this.price = price;
    }

    fruit(double weight) {
        this.weight = weight;
    }

    fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    fruit(int price, String name) {
        this.price = price;
        this.name = name;
    }

    fruit(String name, int price, double weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    fruit(String name, int price, double weight, String color) {
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String toString() {

        return "Name is: " + name + "\tPrice is: " + price + "\tWeight is: " + weight + "\tColor is: " + color;
    }
}
