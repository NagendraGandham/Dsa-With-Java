package StackImplementation.StackUsingArrays.Resizing;

public class ResizingStackUsingArrays {
    protected int[] stackArray;
    protected int top;
    protected int maxSize;

    public ResizingStackUsingArrays(int size){
        maxSize=size;
        stackArray=new int[size];
        top=-1;
    }
    public void push(int element){
        if(isFull()){
           resize();
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
    public void resize(){
        maxSize*=2;
        System.out.println("stack is resized");
        int[] newArray=new int[maxSize];
        for(int i=0;i<stackArray.length;i++){
            newArray[i]=stackArray[i];
        }
        stackArray=newArray;
    }
}
