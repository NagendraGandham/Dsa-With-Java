package LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedListDemo {
    private Node head,tail;
    private int size;

    Node insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev=head;
            size++;
            return head;
        }
        newNode.next=head;
        newNode.prev=head.prev;
        head.prev.next=newNode;
        head.prev=newNode;
        head=newNode;
        size++;
        return head;
    }

    Node insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
            size++;
            return head;
        }
        newNode.next=head;
        newNode.prev=head.prev;
        head.prev.next=newNode;
        head.prev=newNode;
        tail=newNode;
        size++;
        return head;
    }

    Node insertAtPos(int data,int pos){
        if(pos<=0){
            System.out.println("position is not valid\n");
            return head;
        }
        if(pos==1){
            return insertAtBeginning(data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        int currPos=1;
        do{
            if(pos==currPos){
                break;
            }
            currPos++;
            temp=temp.next;
        }while(temp!=head);
        if(temp==head) {
            System.out.println("The positon is invalid");
            return head;
        }
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
            return head;

    }

    Node insertAfterValue(int data,int value){
        if(head==null){
            System.out.println("No such value is exist\n");
            return head;
        }
        Node newNode=new Node(data);
        if(head.data==value){
            newNode.next=head.next;
            newNode.prev=head;
            head.next.prev=newNode;
            head.next=newNode;
            size++;
            return head;
        }
        Node temp=head;
        do{
            if(temp.data==value){
                break;
            }
            temp=temp.next;
        }while(temp!=head);
        if(temp==head){
            System.out.println("No  such value exist\n");
            return head;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        size++;
        return head;
    }

    Node deleteFromHead(Node head){
        if(head==null){
            System.out.println("nothing to delete\n");
            return head;
        }
        if(head.next==head){
            head.next=null;
            head.prev=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
        Node temp=head;
        head=head.next;
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.prev=null;
        temp.next=null;
        size--;
        this.head=head;
        return head;

    }

    Node deleteFromEnd(Node head){
        if(head==null){
            System.out.println("Nothing to delete\n");
            return head;
        }
        if(head==head.next){
            head.prev=null;
            head.next=null;
            head=null;
            size--;
            tail=null;
            return head;
        }
        Node temp=head.prev;
        head.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        size--;
        tail=head.prev;
        return head;
    }

    Node deleteFromPos(Node head,int pos){
        if(head==null ){
            System.out.println("List is empty nothing to delete\n");
            return head;
        }
        if(pos==1){
            return  deleteFromHead(head);
        }
        if(pos<=0){
            System.out.println("inavlid position");
            return head;
        }
        int currentpos=1;
        Node temp=head;
        do{
            if(pos==currentpos){
                break;
            }
            temp=temp.next;
            currentpos++;
        }while(temp!=head);
        if(temp==head){
            System.out.println("Invalid position");
            return head;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
        size--;
        return head;
    }

    Node deleteByValue(Node head,int value){
        if(head==null){
            System.out.println("List is empty nothing to delete\n");
            return head;
        }
        if(head.data==value){
            return  deleteFromHead(head);
        }
        Node temp=head;
        do{
            if(temp.data==value){
                break;
            }
            temp=temp.next;
        }while(temp!=head);
        if (temp == head) {
            System.out.println("There is no node with that value");
            return head;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
        size--;
        return head;
    }
    void traversalcdll(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
        System.out.println("Size : "+size);
    }

    void reverseTraversalcdll(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head.prev;
        do{
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;
        }while(temp!=head.prev);
        System.out.println();
    }


    public static void main(String[] args) {
        Node head;
        CircularDoublyLinkedListDemo cdll=new CircularDoublyLinkedListDemo();
        head=cdll.insertAtBeginning(10);
        head=cdll.insertAtBeginning(161);
        head=cdll.insertAtEnd(66);
        head=cdll.insertAtPos(67,3);
        head=cdll.insertAtPos(2,1);
        cdll.traversalcdll(head);
        cdll.reverseTraversalcdll(head);
        head=cdll.insertAfterValue(1,2);
        head=cdll.insertAfterValue(99,66);
        head=cdll.insertAfterValue(1090,67);
        cdll.traversalcdll(head);
        cdll.reverseTraversalcdll(head);
        head=cdll.deleteFromHead(head);
        cdll.traversalcdll(head);
        head=cdll.deleteFromEnd(head);
        cdll.traversalcdll(head);
        head=cdll.deleteFromPos(head,6);
        head=cdll.deleteFromPos(head,3);
        cdll.traversalcdll(head);
        head=cdll.deleteByValue(head,3);
        head=cdll.deleteByValue(head,1090);
        head=cdll.deleteByValue(head,67);
        cdll.traversalcdll(head);
    }
}
