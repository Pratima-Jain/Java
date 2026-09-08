package copyConstructor;

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
        this(name);
        this.price = price;
    }

    fruit(int price, String name) {
        this(name, price);
    }

    fruit(String name, int price, double weight) {
        this(name, price);
        this.weight = weight;
    }

    fruit(String name, int price, double weight, String color) {
        this(name, price, weight);
        this.color = color;
    }

    fruit(fruit x) {
        this.name = x.name;
        this.price = x.price;
        this.weight = x.weight;
        this.color = x.color;
    }

    public String toString() {
        return "Name is: " + name + "\tPrice is: " + price + "\tWeight is: " + weight + "\tColor is: " + color;
    }
}
