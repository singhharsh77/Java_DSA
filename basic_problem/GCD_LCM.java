
import java.util.*;
class Main {

    static long gcd(long a, long b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0) return b;
        if(b==0) return a;

        while(b!=0){
            long t = a%b;
            a=b;
            b=t;
        }
        return a;
    }
    static long lcm(long a ,long b){
    if(a==0 || b==0) return 0;   // LCM is 0 if any number is 0
    long g = gcd(a, b);
    return Math.abs((a / g) * b);  // divide first to avoid overflow
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integers (a,b) ");
    if(!sc.hasNextLong()){
        System.out.print("Enter a Valid Input for a ");
        return;

    }
    long a = sc.nextLong();
    if(!sc.hasNextLong()){
        System.out.print("Enter a Valid Input for b ");
    }
    long b = sc.nextLong();

    if(a==0 && b==0){
        System.out.print("GCD is undefined for (0,0).  LCM is 0 by convention.");
        return;
    }
    long g = gcd(a,b);
    long l = lcm(a,b);
    
    System.out.println("GCD: "+ g);
    System.out.println("LCM: "+ l);
        sc.close();




    }
}