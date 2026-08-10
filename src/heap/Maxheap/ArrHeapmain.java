package heap.Maxheap;

public class ArrHeapmain {
    public static void main(String[] args) {
        //top down approach (nlogn)
        MaxHeap heap=new MaxHeap(0);
        int[] arr={3,5,9,6,8,20,10,12,18,1};
        heap.buildHeap(arr,10);
        heap.display(arr);

        //bottom up
        MaxHeap heap1=new MaxHeap(0);
        int[] arr1={3,5,9,6,8,20,10,12,18,1};
        heap1.buildHeapBottomUp(arr1,arr1.length-1);

        heap1.display(arr);
    }
}
