package StackImplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingSingleQueue {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    void push(int x){
        int size=queue1.size();
        queue1.offer(x);
        for(int i=0;i<size;i++){
            queue1.offer(queue1.poll());
        }
        System.out.println(queue1);
    }

    int pop() throws Exception{
        if(queue1.isEmpty()){
           throw new Exception("Queue is empty");
        }
        return queue1.poll();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue stack=new StackUsingSingleQueue();
        try {
            stack.push(6);
            stack.push(3);
            stack.push(8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
