package Queue.QueueImplementationUsingLinkedList;

import java.util.Queue;

public class QueueUsingLL {
    Node front,rear;
    int count;
    public QueueUsingLL(){
        front=null;
        rear=null;
        count=0;
    }

    public boolean enqueue(int x){
        Node newNode=new Node(x);
        if(front==null){
            front=newNode;
            rear=newNode;
            return  true;
        }
        rear.next=newNode;
        rear=newNode;
        return true;
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot delete queue is empty");
        }
        Node temp=front;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return temp.data;
    }

    boolean isEmpty(){
        return front==null;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot peek queue is Empty");
        }
        return front.data;
    }
}
