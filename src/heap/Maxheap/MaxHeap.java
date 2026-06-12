package heap.Maxheap;

public class MaxHeap {
    int[] heapArr;
    int capacity;
    int size;
    MaxHeap(int capacity){
        this.capacity=capacity;
        heapArr=new int[capacity];
        size=0;
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

    void swap(int i,int j){
        int temp=heapArr[i];
        heapArr[i]=heapArr[j];
        heapArr[j]=temp;
    }

    void insert(int value){
        heapArr[size]=value;
        int i=size;
        size++;
        while(i!=0 && heapArr[ parent(i)]<heapArr[i]){
            swap(i,parent(i));
            i=parent(i);
        }
    }

    void deleteMax(){
        if(size==0){
            System.out.println("heap is Empty");
            return;
        }
        int max=heapArr[0];
        heapArr[0]=heapArr[size-1];
        size--;
        int i=0;
        while(true){
            int maxIndex=i;
            int left=leftChild(i);
            int right=rightChild(i);
            if(left<size && heapArr[left]>heapArr[maxIndex]){
                maxIndex=left;
            }
            if(right<size && heapArr[right]>heapArr[maxIndex]){
                maxIndex=right;
            }
            if(maxIndex!=i){
                swap(i,maxIndex);
                i=maxIndex;
            }
            else{
                break;
            }

        }
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(heapArr[i]+" ");
        }
        System.out.println();
    }
}
