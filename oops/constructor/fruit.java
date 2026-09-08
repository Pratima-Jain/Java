// package constructor;

public class fruit {
    String name;
    int price;
    double weight;
    String color;

    fruit() {
        System.out.println("fruit object created");
    }

    public String getDetails() {
        return "Name is: " + name + "\nPrice is: " + price + "\nWeight is: " + weight + "\nColor is: " + color;
    }
}
