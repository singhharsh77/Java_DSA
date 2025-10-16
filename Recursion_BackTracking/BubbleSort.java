package Recursion_BackTracking;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {100,3,65,2,98,23,76,1,5};
        int n = arr.length;

        System.out.println("Array before sorting: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Array after sorting: ");
        bubbleSort(arr, n);
        for(int num : arr){
            System.out.print(num + " ");}

    }

    public static void bubbleSort(int[] arr,int n){
        if(n==1) return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                //swap
                int temp =arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,n-1);

    }
}
