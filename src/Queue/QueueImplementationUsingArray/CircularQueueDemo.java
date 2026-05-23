package Queue.QueueImplementationUsingArray;

public class CircularQueueDemo {
    private int[] queue;
    private int rear,front;
    private int n;
    public CircularQueueDemo(int size){
        n=size;
        rear=-1;
        front=-1;
        queue=new int[size];
    }

    public boolean enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full ");
            return false;
        }
        if(front==-1 && rear==-1){
            front++;
            rear++;
            queue[rear]=x;
            return true;
        }
        rear=(rear+1)%n;
        queue[rear]=x;
        return true;
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
        front=(front+1)%n;
        return removedElement;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return (rear+1)%n==front;
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
        int i=front;
        while(i!=rear){
            System.out.print(queue[i]+" -> ");
            i=(i+1)%n;
        }
        System.out.println(queue[rear]);
    }
}
