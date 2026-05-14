package StackImplementation.StackUsingArrays.Resizing;

public class MainClass {
    public static void main(String[] args) {
        ResizingStackUsingArrays stack = new ResizingStackUsingArrays(5);
        try {
            stack.push(63);
            stack.push(32);
            stack.push(5);
            stack.push(6);
            stack.push(8);
            stack.push(66);
            stack.push(62);
            while(!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
