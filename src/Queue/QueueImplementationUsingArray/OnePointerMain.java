package Queue.QueueImplementationUsingArray;

public class OnePointerMain {
    public static void main(String[] args) {
        QueueImplementationUsingOnePointer queue=new QueueImplementationUsingOnePointer(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("the top element is "+queue.front());
        System.out.println("removed element is "+queue.deque());
        queue.display();
    }
}
