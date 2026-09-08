package oops.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
        List c = new ArrayList();

        c.add(23);
        c.add(45);
        c.add(89);
        c.add(54);
        c.add(null);
        c.add(null);

        c.add(1, 77);
        c.add(0, 90);
        c.remove(3);
        c.add(7, 88);

        System.out.println(c);

    }
}
