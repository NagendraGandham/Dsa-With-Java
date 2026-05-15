package StackImplementation.StackUsingLinkedList;

public class StackUsingLL {
   private Node top;
   public StackUsingLL(){
       this.top=null;
   }

   public void push(int data){
       Node newNode=new Node(data);
       newNode.next=top;
       top=newNode;
   }

   public int pop() throws  Exception{
       if(isEmpty()){
           throw new Exception("Stack is empty .cannot pop");
       }
       int val=top.data;
       top=top.next;
       return val;
   }

   public boolean isEmpty(){
       return top==null;
   }

    public int peek() throws  Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty .cannot peek");
        }
        return top.data;
    }
}
