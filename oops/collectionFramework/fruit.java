package oops.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class fruit{
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

    public String toString() {
        return "Name is: " + name + "\tPrice is: " + price + "\tWeight is: " + weight+"\tColor is: " +color;
    }

    public String getDetails() {
        return "Name is: " + name + "\nPrice is: " + price + "\nWeight is: " + weight+"\nColor is: " +color;
    // }
    // public static void main(String[] args) {
    //      Collection<fruit> c1 = new ArrayList<>();
    //     c1.add(new fruit("apple"));
    //     c1.add(new fruit("apple"));
    //     System.out.println(c1);
    }
}
