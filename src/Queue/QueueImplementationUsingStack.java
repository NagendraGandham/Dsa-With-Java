package Queue;

import java.util.Stack;

public class QueueImplementationUsingStack {
     Stack<Integer> stack1=new Stack<>();
     Stack<Integer> stack2=new Stack<>();
     void enqueue(int x){
         stack1.push(x);
     }

     int dequeue() throws Exception{
         if(empty()){
             throw new Exception("Queue is Empty Cannot pop.");
         }
         if(!stack2.isEmpty()){
             return stack2.pop();
         }
         while(!stack1.isEmpty()){
             stack2.push(stack1.pop());
         }
         int removedElement=stack2.pop();
         return removedElement;

     }

     int peek() throws Exception{
         if(empty()){
             throw new Exception("Queue is Empty Cannot Peek.");
         }
         if(!stack2.isEmpty()){
             return stack2.peek();
         }
         while(!stack1.isEmpty()){
             stack2.push(stack1.pop());
         }
         int removedElement=stack2.peek();
         return removedElement;
     }

     boolean empty(){
         return stack1.isEmpty() && stack2.isEmpty();
     }

    public static void main(String[] args) {
        QueueImplementationUsingStack queue=new QueueImplementationUsingStack();
        try {
            queue.enqueue(33);
//            queue.enqueue(35);
            queue.enqueue(35);
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
