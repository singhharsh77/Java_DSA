package Recursion_BackTracking;

public class SayDigits {
    //.   I/p 123
    // o/p one two three
    static String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args){
        int n = 123;
    System.out.println();

        sayDigits(n);
    System.out.println();
    System.out.println();


    }
    static void sayDigits(int n){
        if(n==0) return;
        int digit = n%10;
        sayDigits(n/10);
        System.out.print(arr[digit]+" ");
        
    }
}
