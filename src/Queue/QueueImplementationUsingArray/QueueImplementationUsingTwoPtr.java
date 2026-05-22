package Queue.QueueImplementationUsingArray;

public class QueueImplementationUsingTwoPtr {
    private int[] queue;
    private int rear,front;

    public QueueImplementationUsingTwoPtr(int size){
        rear=-1;
        front=-1;
        queue=new int[size];
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full ");
            return;
        }
        rear++;
        queue[rear]=x;
        if(front==-1){
            front++;
        }
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty so cannot delete");
        }
        if(front==rear){
            int removedElement=queue[front];
            front=-1;
            rear=-1;
            return removedElement;
        }
        int removedElement=queue[front];
        front++;
        return removedElement;
    }

    public boolean isEmpty(){
        return rear==-1 || front>rear;
    }

    public boolean isFull(){
        return rear==queue.length-1;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty so cannot peek");
        }
        return queue[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
