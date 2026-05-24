package Queue.QueueImplementationUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            QueueUsingLL queue = new QueueUsingLL();
            queue.enqueue(10);
            System.out.println(queue.peek());
            queue.enqueue(20);
            queue.display();
            System.out.println("Removed Node is " + queue.dequeue());
            queue.display();
            System.out.println(queue.peek());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
