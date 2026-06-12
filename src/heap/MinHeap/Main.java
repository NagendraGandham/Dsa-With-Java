package heap.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         //Using ArrayList
        MinHeapDemo heap=new MinHeapDemo();
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.display();
        heap.insert(6);
        heap.display();
        heap.deleteMin();
        heap.deleteMin();
        heap.display();
        heap.deleteMin();
        heap.deleteMin();
        heap.display();
    }
}
