package oops.collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class p5 {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(34);
        q.offer(50);
        q.offer(10);
        q.offer(4);
        q.offer(29);
        q.offer(19);
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }

}
