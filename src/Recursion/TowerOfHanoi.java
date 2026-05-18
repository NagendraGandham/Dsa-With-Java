package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void towerOfHanoi(int n,char s,char h,char d){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1,s,d,h);
        System.out.println("Move from "+s+ " to "+d);
        towerOfHanoi(n-1,h,s,d);
    }

    public static void main(String[] args) {
        System.out.print("Enter the no of disks:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,'S','H','D');
    }
}
