package Arrays;

public class ArrayOperations {
    static void traverseArray(int[] arr1,int size){
//    for(int i:arr1){
//        System.out.println(i);
//    }
        int i=0;
        while (i<size){
            System.out.println(arr1[i]);
            i++;
        }
    }
    static void insertAtBeggining(int[] arr){}
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 2;
        arr[0] = 1;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int size = 5;
        traverseArray(arr, size);
        System.out.println(arr.length);
        insertAtBeggining(arr);
    }
}
