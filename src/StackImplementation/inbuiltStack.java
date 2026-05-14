package StackImplementation;

import java.util.Stack;

public class inbuiltStack {
    public static void main(String[] args) {
        Stack<Object> stack=new Stack<>();//object store any datatype
        stack.push(1);
        stack.push(20);
        stack.push(10);
        stack.push("oo");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
