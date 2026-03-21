// input N = 5
//14 5, 10 4, 8 3, 6 2, 4 1, 10 5
// output 4 1, 6 2, 8 3, 10 4, 10 5, 14 5
// with SELECTION SORT
import java.util.*;

public class sort2Darray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
 // arrow function
 // Arrays.sort(arr, (a, b) -> {
 //            if(a[1] != b[1]){
 //                return Integer.compare(a[1], b[1]); // sort by 2nd column
 //            } else {
 //                return Integer.compare(a[0], b[0]); // tie-breaker: 1st column
 //            }
 //        });

 
// Selection Sort
        for(int i = 0; i < n-1; i++){
            int minIndex = i;

            for(int j = i+1; j < n; j++){
                // Compare second column
                if(arr[j][1] < arr[minIndex][1]){
                    minIndex = j;
                }
                // If equal → compare first column
                else if(arr[j][1] == arr[minIndex][1]){
                    if(arr[j][0] < arr[minIndex][0]){
                        minIndex = j;
                    }
                }
            }

            // Swap
            int[] temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}