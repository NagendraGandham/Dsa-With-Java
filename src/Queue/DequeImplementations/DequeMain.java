package Queue.DequeImplementations;

public class DequeMain {
    public static void main(String[] args) throws Exception{
        DequeImplementationUsingCircularArray deque=new DequeImplementationUsingCircularArray(4);
        deque.addFront(10);
        deque.addFront(20);
        deque.addFront(30);
        deque.addRear(40);
        deque.display();
        System.out.println(deque.deleteFront());
        System.out.println(deque.deleteRear());
        System.out.println(deque.deleteRear());
        deque.addRear(999);
        deque.addFront(99);
        System.out.println(deque.deleteFront());
        deque.display();

    }
}
