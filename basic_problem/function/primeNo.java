package function;
import java.util.*;

public class primeNo {

    public static boolean isprime(int n){
        for(int i =2;i <= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(isprime(n)){
            System.out.println("is a prime num: ");
        }else{
            System.out.println("not a prime: ");
        }

                sc.close();

    }
    
}
