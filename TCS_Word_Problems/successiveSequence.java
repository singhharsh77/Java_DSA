// There is an integer array ‘A’ of size ‘N’.
// A sequence is successive when the adjacent elements of the sequence have a
// difference of 1.
// You must return the length of the longest successive sequence.
// For example,
// Input:
// A = [5, 8, 3, 2, 1, 4], N = 6
// Output: 5

import java.util.*;
public class successiveSequence {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ;i<n ;i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int maxLeng = 1;


        if(n == 0){
            System.out.print(" Can not find the length of longest successive sequence");
        }

       for(int i =1; i<n ;i++){
        if(A[i] == A[i-1]){
            continue;
        }
        else if( A[i] == A[i-1] + 1){
            maxLeng++;
        }
        else{
            maxLeng = 1;
        } // A = [5, 8, 3, 2, 1, 4], N = 6
       }

       System.out.print(maxLeng);

    }
}
