// A party has been organized on cruise. The party is organized for a limited time(T). The number of
// guests
// entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The
// task is to
// find the maximum number of guests present on the cruise at any given instance within T hours.
// Example 1:
// Input :
// 5 -> Value of T
// [7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by new line
// [1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
// Output :
// 8 -> Maximum number of guests on cruise at an instance.

import java.util.*;
class SumOfArrayNumber{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array : ");
        int num1 = sc.nextInt();
      
        int E[] = new int[num1];
// first array input
        System.out.print("Enter 1st array : ");

        for(int i = 0; i<num1;i++){
            E[i] = sc.nextInt();
        }
        // second array inpu
        System.out.print("Enter 2nd array : ");

        int L[] = new int[num1];
        for(int i = 0; i<num1;i++){
            L[i] = sc.nextInt();
        }


        int maxGuest = 0;
        int currentGuest = 0;
       for(int i = 0; i < num1; i++) {
    currentGuest = currentGuest + E[i] - L[i];
    maxGuest = Math.max(maxGuest, currentGuest);
       }

        System.out.println("Maximum number of guests on cruise at an instance : " + maxGuest);

    }
}