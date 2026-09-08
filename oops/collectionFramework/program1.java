package oops.collectionFramework;

import java.util.Collection;
import java.util.ArrayList;

public class program1 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(23);
        c.add(45);
        c.add(89);
        c.add(54);

        Collection<fruit> c1 = new ArrayList<>();
        c1.add(new fruit("apple"));
        c1.add(new fruit("mango"));

        int sum = 0;
        for (int i : c) {
            sum += (int) i;
        }
        System.out.println(sum);

        System.out.println("c1--------------");
        for (fruit n : c1) {
            System.out.println(n);
        }

    }
}
