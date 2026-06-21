package heap.Maxheap;

public class HeapSort {

    int parent(int i){
        return (i-1)/2;
    }

    int leftChild(int i){
        return 2*i+1;
    }

    int rightChild(int i){
        return 2*i+2;
    }

    void Heapsort(int[] arr,int size){
        int startIndex=(size/2)-1;
        for(int i=startIndex;i>=0;i--){
            heapify(arr,i,size);
        }

        for(int i=size-1;i>0;i--){
            swapping(i,0,arr);
            heapify(arr,0,i);
        }
    }

    void heapify(int[] arr,int i,int size) {
        while (true) {
            int maxIndex = i;
            int left = leftChild(i);
            int right = rightChild(i);
            if (left < size && arr[left] > arr[maxIndex]) {
                maxIndex = left;
            }
            if (right < size && arr[right] > arr[maxIndex]) {
                maxIndex = right;
            }
            if (maxIndex != i) {
                swapping(i, maxIndex, arr);
                i = maxIndex;

            } else {
                break;
            }
        }
    }

    void swapping(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

