package Recursion_BackTracking;

public class Fibonacci  {
    // 0 1 1 2 3 5 8 13 21
    public static void main(String[] args){
        int n = 5;
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }

}
