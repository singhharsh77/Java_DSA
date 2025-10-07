package TwoDArray;

public class CountPrimes {
    // ye Question krenge SIEVE OF ERATOSTHENES
    public static void main(String[] args) {
        //initially assume all numbers are prime
        //then we will mark non-prime numbers as false
        //so we will use boolean array
        //index represent the number itself
        //value at that index represent whether it is prime or not  

        int n = 20;
        System.out.println(countPrimes(n));

    }

    public static int countPrimes(int n){
        boolean[] notprime = new boolean[n];
        //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        //f,f,f,f,f,f,f,f,f,f,  f, f, f, f, f, f, f, f, f, f
        int count = 0;
        for(int i =2;i<n;i++){
            if(notprime[i]==false){
                count++;
            }
            for(int j=2;i*j<n;j++){
                notprime[i*j] = true;
            }
        }
//after this loop count will have the count of prime numbers
//1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
//f,t,t,f,t,f,t,f,f,f, t,  f, t, f, f, f, t, f, t, f = 8
        return count;
    }
}
