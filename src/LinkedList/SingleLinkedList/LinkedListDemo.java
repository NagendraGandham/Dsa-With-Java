package LinkedList.SingleLinkedList;


public class LinkedListDemo {
    private Node head;
    private Node tail;
    private int size;
    void insertAtBeginning(int data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=newNode;
        }
        size++;
    }
    void traverseLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    void inserAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertAtPos(int data,int pos){
        if(pos==1){
            insertAtBeginning(data);
            return;
        }
        Node newNode=new Node(data);
        int currentPos=1;
        Node temp=head;
        while(currentPos<pos-1){
            temp=temp.next;
            currentPos++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void insertAfterValue(int data,int value){
        Node temp=head;
        Node newNode=new Node(data);
        while(temp!=null && temp.data!=value){
            temp=temp.next;
        }
        if(temp!=null){
            newNode.next=temp.next;
            temp.next=newNode;
        }
        else{
            System.out.println("Element not found");
        }
    }
    void deleteFromBeginning(){
        if(head==null){
            System.out.println("Nothing is there");
            return;
        }
        head=head.next;
    }
    void deleteFromEnd(){
        if(head==null){
            System.out.println("nothing is there");
            return;
        }
        if(head.next==null){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void deleteFromPos(int pos){
        if(head==null){
            System.out.println("nothing to delete");
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }
//        else{
//            int currentPos=1;
//            Node temp=head;
//            while(currentPos<pos-1){
//                temp=temp.next;
//                currentPos++;
//            }
//            temp.next=temp.next.next;
//
//        }
        else{
                int currentpos=1;
        Node temp=head;
        Node prev;
        while(temp!=null) {
            prev=temp;
            temp=temp.next;
            if (pos ==currentpos){
                prev.next=temp.next;
            }
            currentpos++;
        }
        }
    }
    void deleteByValue(int data){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;
        }
        if(temp.data==data){
            prev.next=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListDemo obj=new LinkedListDemo();
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(20);
        obj.insertAtBeginning(30);
        obj.insertAtBeginning(40);
        obj.inserAtEnd(100);
        obj.insertAtPos(1000,3);
        obj.insertAfterValue(999,1000);
        obj.traverseLinkedList();
        obj.deleteFromBeginning();
        obj.traverseLinkedList();
        obj.deleteFromEnd();
        obj.traverseLinkedList();
        obj.deleteFromPos(4);
        obj.traverseLinkedList();
        obj.deleteByValue(999);
        obj.traverseLinkedList();
    }
}
