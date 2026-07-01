package heap.Maxheap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.offer(20);
        pq.offer(10);
        pq.offer(2);
        System.out.println(pq);

        pq.remove();

        System.out.println(pq  );

    }
}
