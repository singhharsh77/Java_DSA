//Q2. Given an integer array Arr of size N the task is to find the count of elements whose value
//is greater than all of its prior elements.
//Note : 1st element of the array should be considered in the count of the result. For example,
//Arr[]={7,4,8,2,9} As 7 is the first element, it will consider in the result. 8 and 9 are also the
//elements that are greater than all of its previous elements. Since total of 3 elements is
//present in the array that meets the condition.
//Hence the output = 3.
//Example 1:
//Input 5 -> Value of N, represents size of Arr
//7-> Value of Arr[0]
//4 -> Value of Arr[1]
//8-> Value of Arr[2]
//2-> Value of Arr[3]
//9-> Value of Arr[4]
//
//Output : 3


// Input Enter N;5
// Enter Array;3
// 5
// 2
// 6
// 7
// Output : Count is;4


import java.util.Scanner;

public class Greater_than_prior_elements {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      //input lena h
      System.out.print("Enter N;");
      int n = sc.nextInt();
      System.out.print("Enter Array;");
      int arr[] = new int[n];
      for(int i = 0 ;i<n; i++){
          arr[i] = sc.nextInt();
      }
      
      // ab edge case lelo
      if (n == 0) {
                System.out.println(0);
                return;
            }
            
            
    // ab mudde ki baaat
    
    int count = 1;
    int maxnum = arr[0];
    
    
    for(int i = 0; i<n;i++){
        if(arr[i]>maxnum){
            count++;
            maxnum = arr[i];
        }
    }
    System.out.println("Count is;" + count);
    }
}
