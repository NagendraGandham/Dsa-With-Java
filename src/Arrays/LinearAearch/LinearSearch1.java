package Arrays.LinearAearch;

public class LinearSearch1 {
    static int linearSearch(int[] arr1, int x) {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==x){
//                //transposition
//                if(i>0){
//                    int temp=arr1[i];
//                    arr1[1]=arr1[i-1];//swapping with previous
//                    arr1[i-1]=temp;
//                }
                //move to front6
//                if(i>0){
//                    int temp=arr1[i];
//                    arr1[i]=arr1[0];//swapping with first
//                    arr1[0]=temp;
//                }
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,34,6,4,76,3,6,3,64,523,3};
        int key=76;
        int result=linearSearch(arr,key);
        if(result!=-1){
            System.out.println("The element in the index "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
