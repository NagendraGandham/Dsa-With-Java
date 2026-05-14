package StackImplementation.StackUsingArrays;

public class StackUsingArrays {
    protected int[] stackArray;
    protected int top;

    public StackUsingArrays(int size){
        stackArray=new int[size];
        top=-1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stackArray[top]=element;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not pop because stack is empty");
        }
        int x=stackArray[top];
        top--;
        return x;
    }
    boolean isFull(){
        return top==stackArray.length-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not peek because stack is empty");
        }
        return stackArray[top];
    }
}
