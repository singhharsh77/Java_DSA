package Recursion_BackTracking;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int target = 7;
        boolean ans = LinearSearch(arr,target,0);
        System.out.println(ans ? "Element found" : "Element not found");
    }

    public static boolean LinearSearch(int[] arr, int target, int index){
        if(index==arr.length) return false;
        return (arr[index] == target) || LinearSearch(arr, target, index+1);
    }
}
