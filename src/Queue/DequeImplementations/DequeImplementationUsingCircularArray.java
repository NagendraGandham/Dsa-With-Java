package Queue.DequeImplementations;

public class DequeImplementationUsingCircularArray {
    int[] deque;
    int front,rear;
    int size;
    DequeImplementationUsingCircularArray(int size){
        deque=new int[size];
        this.size=size;
        front=-1;
        rear=-1;
        System.out.println("Deque is created of size "+size);
    }

    void addFront(int data) throws Exception{
        if(isFull()){
            throw new Exception("Deque is full cannot add");
        }
        if(front==-1){
            front++;
            rear++;
            deque[front]=data;
            return;
        }
        front=((front-1)+size)%size;
        deque[front]=data;
        return;
    }

    void addRear(int data) throws Exception{
        if(isFull()){
            throw new Exception("Deque is full cannot add");
        }
        if(front==-1){
            front++;
            rear++;
            deque[front]=data;
            return;
        }
        rear=(rear+1)%size;
        deque[rear]=data;
        return;
    }

    int deleteFront() throws Exception{
        if(isEmpty()){
            throw new Exception("The deque is empty");
        }
        int ele=deque[front];
        if(front==rear){
            front=-1;
            rear=-1;
            return ele;
        }
        front=(front+1)%size;
        return ele;
    }

    int deleteRear() throws Exception{
        if(isEmpty()){
            throw new Exception("The deque is empty");
        }
        int ele=deque[rear];
        if(front==rear){
            front=-1;
            rear=-1;
            return ele;
        }
        rear=((rear-1)+size)%size;
        return ele;
    }

    int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek queue is empty");
        }
        return deque[front];
    }

    int getRear() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek queue is empty");
        }
        return deque[rear];
    }

    boolean isFull(){
        return (rear+1)%size==front;
    }

    void display() throws Exception{
        if(isEmpty()){
            throw new Exception("The deque is empty");
        }
        int front1=front;
        while(front1!=rear) {
            System.out.print(deque[front1] + " ");
            front1 = (front1 + 1) % size;
        }
        System.out.println(deque[front1]);
    }

    boolean isEmpty(){
        return front==-1;
    }
}
