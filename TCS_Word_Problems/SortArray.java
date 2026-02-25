//Q8. Sort one array according to another array You are given two arrays a[] (integer) and b[] (char).
//The ith value of a[] corresponds to the ith value of b[].
//Sort the array b[] with respect to a[].
//Note: The output is whitespace and newline character sensitive. After every character print a
//whitespace character. Also do not print any newline character at any point.
//Example 1: Input: a[] = {3, 1, 2} b[] = {'G', 'E', 'K'}
//Output: E K G
//Explanation: Here 3 corresponds to G, 1 corresponds to 'E', 2 corresponds to 'K'
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        // int[] a = {3, 1, 2};
        // char[] b = {'G', 'E', 'K'};


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        char[] b = new char[n];


        System.out.print("Enter 1st array : ");
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }   
        System.out.print("Enter 2nd array : ");
        for(int i = 0; i<n; i++){
            b[i] = sc.next().charAt(0);
        }   

        for(int i = 0; i<a.length - 1; i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                char tempChar = b[i];
                b[i] = b[i+1];
                b[i+1] = tempChar;
            }
        }

        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
    
}
