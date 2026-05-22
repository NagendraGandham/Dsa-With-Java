package Queue.QueueImplementationUsingArray;

public class TwoPointerMain {
    public static void main(String[] args) {
        QueueImplementationUsingTwoPtr queue=new QueueImplementationUsingTwoPtr(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        try {
        System.out.println(queue.front());

            System.out.println("the Removed Element is" + queue.dequeue());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        queue.display();
    }
}
