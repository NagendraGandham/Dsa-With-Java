package Arrays.BinarySearch;
public class    UpperBoundBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,4,4,4,4,4,5,6};
        int high=arr.length-1;
        int low=0,ub=arr.length;
        int x=7;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){                     // if(arr[mid]>=x){--> it is lower bound
                ub=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ub);
    }
}
