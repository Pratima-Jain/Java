package oops.collectionFramework;

import java.util.Collection;
import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(23);
        c.add(45);
        c.add(89);
        c.add(54);
        c.add(null);
        c.add(null);

        System.out.println(c);

    }
}
