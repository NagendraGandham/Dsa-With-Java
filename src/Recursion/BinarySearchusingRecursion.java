package Recursion;

import java.util.Scanner;

public class BinarySearchusingRecursion {

    static int binarySearch(int[] arr,int target){
        return recursiveBinarySearch(arr,target,0,arr.length-1);
    }

    static int recursiveBinarySearch(int[] arr,int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return recursiveBinarySearch(arr,target,low,mid-1);
        }
        else{
            return recursiveBinarySearch(arr,target,mid+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
