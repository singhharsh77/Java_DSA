package Recursion_BackTracking;
import java.util.*;
public class FindSubset {
    public static void main(String[] args){
        int[] nums = {1,2};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }

     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); // store all subsets
        List<Integer> output = new ArrayList<>();    // current subset
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }


     public static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base case: if we've considered all elements
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output)); // make a copy of current subset
            return;
        }

        // 1. Exclude current element and move forward
        solve(nums, output, index + 1, ans);

        // 2. Include current element and move forward
        output.add(nums[index]);
        solve(nums, output, index + 1, ans);

        // Backtrack: remove last element to try next possibility
        output.remove(output.size() - 1);
    }
}
    

