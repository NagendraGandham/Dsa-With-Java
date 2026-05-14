package StackImplementation.StackUsingArrays;

public class mainClass {
    public static void main(String[] args) throws Exception{
        StackUsingArrays stack=new StackUsingArrays(5);
        try {
            stack.push(8);
            stack.push(4);
            stack.push(2);
            stack.push(11);
            stack.push(45);
            stack.push(78);
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
