package heap.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeapDemo {
    List<Integer> heapList;
    int size;
    MinHeapDemo() {
        heapList = new ArrayList<>();
        size = 0;
    }


    void insert(int value){
        heapList.add(value);
        int i=size;
        size++;
        while(i!=0 && heapList.get(parent(i))>heapList.get(i)){
            swap(i,parent(i));
            i=parent(i);
        }
    }

    void deleteMin(){
        if(size==0){
            System.out.println("heap is Empty");
            return;
        }
        int min=heapList.get(0);
        heapList.set(0,heapList.getLast());
        heapList.removeLast();
        size=heapList.size();
        int i=0;
        while(true){
            int minIndex=i;
            int left=leftChild(i);
            int right=rightChild(i);
            if(left<size && heapList.get(left)<heapList.get(minIndex)){
                minIndex=left;
            }
            if(right<size && heapList.get(right)<heapList.get(minIndex)){
                minIndex=right;
            }
            if(minIndex!=i){
                swap(i,minIndex);
                i=minIndex;
            }
            else{
                break;
            }

        }
    }

    int parent(int i){
        return (i-1)/2;
    }

    int leftChild(int i){
        return 2*i+1;
    }

    int rightChild(int i){
        return 2*i+2;
    }

    void swap(int i,int j) {
        int temp = heapList.get(i);
        heapList.set(i, heapList.get(j));
        heapList.set(j, temp);
    }


    void display(){
            System.out.print(heapList);
        System.out.println();
    }
}
