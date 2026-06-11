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
