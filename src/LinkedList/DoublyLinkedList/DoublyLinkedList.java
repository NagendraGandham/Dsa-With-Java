package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private static Node head;
    private static Node tail;
    private static int size;
    static Node insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return  head;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
        return head;
    }
    static void traversalDll(Node head){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    static Node deleteFromBeginning(){
        if(head==null){
            System.out.println("There is nothing to delete");
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        Node previousNode=head;
        head=head.next;
        previousNode.next=null;
        head.prev=null;
        return head;
    }
    static Node deleteFromEnd() {
        if (head == null) {
            System.out.println("There is nothing to delete");
            return head;
        }
        if (head.next == null) {
            head = null;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prev;
        prev=temp.prev;
        temp.prev=null;
        prev.next=null;
        return head;
    }
    static void insertAtPosition(int data,int pos){
        if(pos<=0){
            System.out.println("Not valid");
            return;
        }
        if(pos==1){
            head=insertAtBeginning(data);
            return;
        }
        Node temp=head;
        int cuurentPos=1;
        while(temp!=null){
            if(cuurentPos==pos){
                break;
            }
            cuurentPos++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Not valid");
            return;
        }
        else{
            Node newNode=new Node(data);
            newNode.prev=temp.prev;
            newNode.next=temp;
            temp.prev.next=newNode;
            temp.prev=newNode;
        }
    }
    static Node deleteFromPosition(int pos){
        if(head==null){
            System.out.println("list is empty");
            return head;
        }
        else if(pos==1){
            return deleteFromBeginning();
        }
        Node temp=head;
        int currentPos=1;
        while(temp!=null){
            if(currentPos==pos){
                break;
            }
            currentPos++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("not valid");
            return head;
        }
        else{
            Node prev=temp.prev;
            prev.next=temp.next;
            temp.prev=null;
            if(temp.next!=null){
                Node next=temp.next;
                temp.next=null;
                next.prev=prev;

            }
            temp.prev=null;
            return head;

        }
    }
     static Node reverseLinkedList(){
        if(head==null){
            return head;
        }
        Node current=null;
        Node temp=head;
        while(temp!=null){
            current=temp.prev;
            temp.prev=temp.next;
            temp.next=current;
            temp=temp.prev;
        }
        head=current.prev;
        return head;
    }

    public static void main(String[] args) {
        Node head;
        head=insertAtBeginning(15);
        head=insertAtBeginning(35);
        traversalDll(head);
        System.out.println(); 
        insertAtEnd(56);
        insertAtEnd(560);
        traversalDll(head);
        System.out.println();
        insertAtPosition(44,3);
        traversalDll(head);
        System.out.println();
        head=deleteFromBeginning();
        traversalDll(head);
        head=deleteFromEnd();
        System.out.println( );
        traversalDll(head);
        System.out.println();
        head=deleteFromPosition(2);
        traversalDll(head);
        reverseLinkedList();
        traversalDll(head);
    }
}
