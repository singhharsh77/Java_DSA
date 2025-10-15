package Recursion_BackTracking;

public class FindSum {

    public static void main(String[] args){
        int n = 5;
        int sum = findSum(n);
        System.out.println(sum);
    }

    public static int findSum(int n){
        if(n==1) return 1;
        return n + findSum(n-1);
    }
    
}
