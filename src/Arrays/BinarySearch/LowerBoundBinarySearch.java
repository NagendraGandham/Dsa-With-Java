package Arrays.BinarySearch;

public class LowerBoundBinarySearch {
    //first occurence of element
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,4};
        int high=arr.length-1;
        System.out.println(high);
        int low=0;
        int x=5;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
}
