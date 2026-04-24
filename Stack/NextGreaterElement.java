//Next Greater element on the right 
// arr = [6,8,0,1,3]
// o/p = [8,-1,1,3,-1]
// o(n) time and o(n) space

// next greater element on the lelft puche to looop ko left arr[0] se start hoga 
// aga puche smallest nikalna h to arr[s.peek()] >= arr[i] ye condition hoga
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args){
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nextGr = new int[arr.length];

        
        for(int i = arr.length-1;i>=0;i--){

            // while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // if else
                if(s.isEmpty()){
                    nextGr[i] = -1;
                }
                else{
                    nextGr[i] = arr[s.peek()];
                }

            // push in stack

                s.push(i);
        }
        for (int i = 0; i < nextGr.length; i++) {
            System.out.print(nextGr[i] + " ");
        }
        System.out.println();
    }
    
}
