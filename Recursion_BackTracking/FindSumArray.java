package Recursion_BackTracking;

public class FindSumArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = findSum(arr,0);
        System.out.println(sum);
    }

    public static int findSum(int[] arr,int index){
        if(index==arr.length) return 0;
        return arr[index]+findSum(arr,index+1);
    }
    
}
