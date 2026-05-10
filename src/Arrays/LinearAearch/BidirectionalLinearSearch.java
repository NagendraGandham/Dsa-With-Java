package Arrays.LinearAearch;
import java.util.Arrays;

public class BidirectionalLinearSearch {

        static int bidirectionalLinearSearch(int[] a,int key) {

         int left=0;
         int right=a.length-1;
         while(left<=right){
             if(a[left]==key){
                 return left;
             }
             if(a[right]==key){
                 return right;
             }
             left++;
             right--;
         }
         return -1;
        }
        public static void main(String[] args) {
            int[] arr=new int[]{1,34,6,4,76,6,64,523,3};
            int key=0;
            int result=bidirectionalLinearSearch(arr,key);

            if(result!=-1){
                System.out.println("The element in the index "+result);
            }
            else{
                System.out.println("Element not found");
            }
        }
    }

