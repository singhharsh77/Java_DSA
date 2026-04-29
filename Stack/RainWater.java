// leetcode 42
public class RainWater {
    public static void main (String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The amount of water that can be trapped is: " + trap(arr)); 

    }

    public static int trap(int[] height){
        int ans = 0;
        int l = 0;
        int n = height.length;
        int r = n-1;
        int lmax = 0, rmax = 0;

        while(l<r){
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if(lmax<rmax){
                ans += lmax-height[l];
                l++;
            }
            else{
                ans += rmax-height[r];
                r--;
            }
        }
        return ans;

    }
}