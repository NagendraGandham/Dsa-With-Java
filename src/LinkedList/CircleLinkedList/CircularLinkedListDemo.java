package LinkedList.CircleLinkedList;

import java.sql.SQLOutput;

public class CircularLinkedListDemo {
    private Node head;
    private Node tail;
    private int size;

    Node insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            head.next=head;
            return head;
        }
        //case1: bioth head and tail are present
        /*tail.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
        return head;*/

        //case2:only head is given
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
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
            size++;
            return head;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
        return head;
    }


    Node insertBeforePosition(int data,int pos){
        Node newNode=new Node(data);

        if(pos<=0){
            System.out.println("positon is invalid!!");
            return head;
        }
        if(pos==1){
            return insertAtBeginning(data);
        }
        int currentPos=1;
        Node temp,prevNode;
        prevNode=null;
        temp=head;
        do{
            if(pos==currentPos){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            currentPos++;
        }while(temp!=head);
        if(temp==head){
            System.out.println("Not a valid position");
            return head;
        }
        newNode.next=temp;
        prevNode.next=newNode;
        size++;
        return head;
    }

    Node insertAfterValue(int data,int value){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("No such values is exist");
            return head;
        }
        if(head.data==value){
            newNode.next=head.next;
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
            System.out.println("No such values exist");
            return head;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        if(temp==tail){
            tail=tail.next;
        }
        return head;
    }
    void traverseCLL(Node head){
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
    }

    Node deleteFromBeginning(Node head1){
        if(head1==null){
            System.out.println("Nothing is there");
            return head1;
        }
        if(head1==head1.next){
            head1.next=null;
            head1=null;
            head=null;
            tail=null;
            size--;
            return head1;
        }
        //case 1:have both head and tail
        /*tail.next=head1.next;
        head1.next=null;
        head1=tail.next;
        size--;
        head=head1;
        return head1;*/

        //case2: when only head is given
        Node temp=head1;
        while(temp.next!=head1){
            temp=temp.next;
        }
        temp.next=head1.next;
        head1.next=null;
        head1=temp.next;
        head=head1;
        size--;
        return head1;
    }
    Node deleteFromEnd(Node head1){
        if(head1==null){
            System.out.println("Nothing is there");
            return head1;
        }
        if(head1==head1.next){
            head1.next=null;
            head1=null;
            head=null;
            tail=null;
            size--;
            return head1;
        }
        //case1: we have both head and tail
        Node temp=head;
        Node prev=null;
        do{
            prev=temp;
            temp=temp.next;
        }while(temp.next!=head);
        prev.next=temp.next;
        temp.next=null;
        tail=prev;
        head=head1;
        size--;
        return head1;
    }

    Node deleteFromPos(Node head,int pos){
        if(head==null){
            System.out.println("Nothing is there");
            return head;
        }
        if(pos==1){
            return deleteFromBeginning(head);
        }
        Node temp=head;
        Node prevNode=null;
        int currenPos=1;
        do{
            if(currenPos==pos){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            currenPos++;
        }while(temp!=head);

        if(temp == head){
            System.out.println("Not a valid position");
            return head;
        }
        prevNode.next=temp.next;
        temp.next=null;
        size--;
        return head;
    }
    Node deleteByValue(Node head,int value){
        if(head==null){
            System.out.println("Nothing is there");
            return head;
        }
        if(head.data==value){
            return deleteFromBeginning(head);
        }
        Node temp=head;
        Node prevNode=null;
        do{
            if(temp.data==value){
                break;
            }
            prevNode=temp;
            temp=temp.next;
        }while(temp!=head);
        if(temp==head){
            System.out.println("No suych value exist cannot delete");
            return head;
        }
        prevNode.next=temp.next;
        temp.next=null;
        size--;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        CircularLinkedListDemo cll=new CircularLinkedListDemo();
        head=cll.insertAtBeginning(10);
        head=cll.insertAtBeginning(20);
        head=cll.insertAtBeginning(30);
        head=cll.insertAtEnd(40);
        head=cll.insertAtEnd(50);
        cll.traverseCLL(head);
        head=cll.insertAtEnd(60);
        head=cll.insertBeforePosition(22,4);
        head=cll.insertBeforePosition(556,2);
        head=cll.insertBeforePosition(56,8);
        head=cll.insertAfterValue(57,56);
        head=cll.insertAfterValue(41,40);
        head=cll.insertAfterValue(61,60);
        cll.traverseCLL(head);
        head=cll.insertAfterValue(61,69);
        cll.traverseCLL(head);
        head=cll.deleteFromBeginning(head);
        cll.traverseCLL(head);
        head=cll.deleteFromEnd(head);
        cll.traverseCLL(head);
        head=cll.deleteFromEnd(head);
        cll.traverseCLL(head);
        System.out.println();
        head=cll.deleteFromPos(head,10);
        cll.traverseCLL(head);
        head=cll.deleteFromPos(head,9);
        cll.traverseCLL(head);
        head=cll.deleteFromPos(head,1);
        cll.traverseCLL(head);
        head=cll.deleteFromPos(head,3);
        cll.traverseCLL(head);
        System.out.println();
        head=cll.deleteByValue(head,20);
        cll.traverseCLL(head);
        head=cll.deleteByValue(head,56);
        cll.traverseCLL(head);
        head=cll.deleteByValue(head,40);
        cll.traverseCLL(head);
        System.out.println();
        head=cll.deleteByValue(head,400);
        cll.traverseCLL(head);
    }
}
