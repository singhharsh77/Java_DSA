import java.util.*;

public class MaxArea {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int maxAr = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();

        for(int i = heights.length-1; i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }


        s= new Stack();

        for(int i = 0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }



        for(int i = 0; i<heights.length;i++){
            int height = heights[i];
            int width = nsr[i] -nsl[i] - 1;
            int currARR = height*width;
            maxAr = Math.max(currARR, maxAr);
        }

        return maxAr;
    }
}