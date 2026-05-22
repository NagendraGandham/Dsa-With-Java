package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.add(1);
        queue.addAll(List.of(2));
        System.out.println(queue);
        queue.remove();//it give execption if queue is empty
        queue.poll();
        System.out.println(queue.poll());//returns null if  nothing is there
//      System.out.println(queue.element());//gives exception if queue is empty
        System.out.println(queue.peek());
    }
}
