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

    void traversalcdll(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
        System.out.println("Size : "+size);
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
    void reverseTraversalcdll(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head.prev;
        do{
            System.out.print(temp.data+" -> ");
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
    }
}
