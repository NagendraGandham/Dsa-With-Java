package Arrays.LinearAearch;

public class SentialLinearSearch {
    static int sentialLinearSearch(int[] a,int key) {

        int n = a[a.length - 1];
        a[a.length-1]=key;
        int i = 0;
        while (key != a[i]) {
            i++;
        }
        a[a.length - 1] = n;
        if (i < a.length - 1 || a[a.length-1] == key) {
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,34,6,4,76,6,64,523,3};
        int key=0;
        int result=sentialLinearSearch(arr,key);

        if(result!=-1){
            System.out.println("The element in the index "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
