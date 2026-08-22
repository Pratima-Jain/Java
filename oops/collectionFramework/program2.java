package oops.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class program2 {
    public static void main(String[] args) {
        List<fruit> l = new ArrayList<>();
        l.add(new fruit("apple"));
        l.add(new fruit("mango"));
        System.out.println("before sorting!!");
        for (fruit f : l) {
            System.out.println(f);

        }
        l.sort(Comparator.comparing((fruit f) -> f.name).reversed());
        System.out.println("after sorting on reverse---");
        for (fruit f : l) {
            System.out.println(f);
        }

    }
}
// design a list to store employ with details name ,id,age,salary .sort the
// employs on all the given details in ascending and descending order using
// .reverse
// design a list of music with details title ,singer,size,year .sort the list on
// all the given details in ascending and descending order using .reverse