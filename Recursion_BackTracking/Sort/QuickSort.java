package Recursion_BackTracking.Sort;
// Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order.
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int[] arr, int s, int e){
        if(s>=e) return;

        //partition krenge
        int pivot = partition(arr, s, e);

        //left part krenge
        quickSort(arr, s, pivot - 1);
        //right part krenge
        quickSort(arr, pivot + 1, e);
    }

    public static int partition(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = s + count;
        //swap
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s];
        arr[s] = temp;

        //left and right part sort krna hai ab
        int i = s, j = e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
    }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                //swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
}
