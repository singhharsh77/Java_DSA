package function;

import java.util.*;

public class nCr {
    public static int factorial(int n ){
        int fact = 1;
        for(int i=1 ; i<= n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int NcR(int n, int r){
        int num = factorial(n);

        int denom = factorial(r) * factorial(n-r);

        return num/denom;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();


        System.out.println("anser is: "+NcR(n,r));
        sc.close();
    }
}