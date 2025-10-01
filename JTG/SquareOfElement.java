package JTG;
import java.util.*;
// Given a sorted array containing N integers, both positive and negative. Create
// another array containing the square off all the elements in the input and retum in
// non-decreasing array.
// INPUT:-7-5-201
// OUTUT: 01 4 25 49
public class SquareOfElement {
    public int[] sortedSquares(int[] nums) {
        int left = 0, n = nums.length, right = n-1, pos = n-1;
        int[] result = new int[n];
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[pos] = nums[left]*nums[left];
                left++;
            }else{
                result[pos] = nums[right]*nums[right];
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        SquareOfElement soe = new SquareOfElement();
        int[] nums = {-7,-5,-2,0,1};
        int[] result = soe.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
