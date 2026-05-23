package Queue.QueueImplementationUsingArray;

public class CircularQueuemain {
    public static void main(String[] args) throws Exception{
        CircularQueueDemo queue=new CircularQueueDemo(3);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);  
            queue.display();
            System.out.println("removed Element"+queue.dequeue());
            System.out.println("removed Element"+queue.dequeue());
            queue.enqueue(40);
            queue.enqueue(409);
            System.out.println("the peek eleement is"+queue.front());
            queue.display();
    }
}
