package LinkedList.DoublyLinkedList;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public Node(int data,Node next,Node prev){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
}
