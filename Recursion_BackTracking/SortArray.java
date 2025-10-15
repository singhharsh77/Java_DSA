package Recursion_BackTracking;

public class SortArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        boolean ans = isSorted(arr,0);

       System.out.println(ans ? "Array is sorted" : "Array is not sorted");
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr, int index){
        if (index == arr.length - 1 ||  arr.length == 0) return true;       // base case + edge case
        if (arr[index] > arr[index + 1]) return false;  // check condition
        return isSorted(arr, index + 1);       

    }
}