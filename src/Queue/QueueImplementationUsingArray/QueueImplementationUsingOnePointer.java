package Queue.QueueImplementationUsingArray;

import java.util.Queue;

public class QueueImplementationUsingOnePointer {
    private int[] queue;
    private int rear;

    public QueueImplementationUsingOnePointer(int size){
        rear=-1;
        queue=new int[size];
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full ");
            return;
        }
        rear++;
        queue[rear]=x;
    }

    public int deque(){
        if(isEmpty()){
            System.out.println("cannot delete queue is empty.");
            return -1;
        }
        int remove=queue[0];
        for(int i=1;i<=rear;i++){
            queue[i-1]=queue[i];
        }
        rear--;
        return remove;
    }



    public boolean isFull(){
        return rear==queue.length-1;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("cannot peek queue is empty.");
            return -1;
        }
        return queue[0];
    }


    public void display(){
        if(isEmpty()){
            System.out.println("cannot display queue is empty.");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i] +"-> ");
        }
        System.out.println();
    }

}
