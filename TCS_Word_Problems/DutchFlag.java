//Airport security officials have confiscated several item of the passengers at the security check
//point. All the items
//have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2].
//Here, the risk severity of
//the items represent an array[] of N number of integer values. The task here is to sort the items based
//on their levels of
//risk in the array. The risk values range from 0 to 2.
//Example:
//Input:
//7 -> Value of N
//[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.
//Output :
//0 0 0 1 1 2 2 -> Element after sorting based on risk severitypublic 
import java.util.*;
class DutchFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
// input lelo
        System.out.print("Enter array elements : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int low= 0;
        int mid = 0;
         int high = n-1;
         while(low <= mid && mid <= high){

            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] ==1){
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

            }
            for(int i=0;i<n; i++){
                System.out.print(arr[i] + " ");
            }
         }
    }

