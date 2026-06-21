package heap.Maxheap;

public class HeapSortMain {
    public static void main(String[] args) {
        int[] heapArr={22,5,9,6,8,20,10,12,18,9};
        HeapSort sort=new HeapSort();
        sort.Heapsort(heapArr,heapArr.length);
        sort.display(heapArr);
    }
}
