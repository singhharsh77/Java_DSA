import java.util.*;
//7. Rotate array by K steps
public class RotateArray {
    public static void main(String[] args){
        // n ka input le liye
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        //array ka input le liya
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //k ka input le liya
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // agar k > n to usko n se mod kar denge example n = 5 & k=7 to 7%5 = 2
        k = k%n;
        // ab array ko rotate karenge
        int[] rotatedarr = new int[n];
        for(int i=0;i<n;i++){
            int newposev = (i+k)%n;
            rotatedarr[newposev] = arr[i];

        }
        // new rotated array print kar denge
        System.out.println("The rotated array is: ");
        for(int num:rotatedarr){
            System.out.print(num+" ");
        }
        System.out.println();
        sc.close();
    }
    
}
