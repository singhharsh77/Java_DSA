package Recursion_BackTracking;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 11;
        int ans = binarySrch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    public static int binarySrch(int[] arr,  int target, int start, int end){
        if(start > end) return -1;
        int mid = start+(end-start)/2;
        if(arr[mid] == target) return mid;

        if(target>arr[mid]){
            return binarySrch(arr, target, mid+1, end);
        }
        else{
            return binarySrch(arr, target, start, mid-1);
        }


    }

}
