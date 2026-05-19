package Recursion;

public class PowerOfANumber {
    static double power(double x,int n){
        long N=n;
        double result=helper(x,Math.abs(N));
        if(n<0) {
            return 1 / result;
        }
        else{
            return result;
        }
    }

    static double helper(double x,long n){
        if(n==0) {
            return 1;
        }
        if(n%2==0){
            return helper(x*x,n/2);
        }
        else{
            return x*helper(x*x,(n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
