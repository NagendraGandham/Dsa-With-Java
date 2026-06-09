package heap.Maxheap;

public class Main {
    public static void main(String[] args) {
        MaxHeap heap=new MaxHeap(10);
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.display();
        heap.insert(60);
        heap.display();
    }
}
