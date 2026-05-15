package StackImplementation.StackUsingLinkedList;

public class StackMain {
    public static void main(String[] args) {
        StackUsingLL stack=new StackUsingLL();
        try{
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println(stack.peek());
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
