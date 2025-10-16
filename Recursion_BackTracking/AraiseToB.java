package Recursion_BackTracking;
// Time Complexity: O(log b)
// Space Complexity: O(log b) due to recursion stack
//a^b print krna
// 2^5 = 2*2^4
// 2^4 = 2^2 * 2^2
// 2^2 = 2^1 * 2^1
// 2^1 = 2^0 * 2^0
// 2^0 = 1
// so, 2^5 = 2 * (2^2 * 2^2) = 2 * (2 * 2) * (2 * 2) = 32

public class AraiseToB {
    public static void main(String[] args){
        int a=2;
        int b=5;
        int ans = power(a,b);
        System.out.println(ans);
    }  
    
    public static int power(int a,int b){
        if(b==0) return 1;
        // b agar even hai to
        int ans = power(a,b/2);
        if(b%2==0) return ans*ans;
        // b agar odd hai to    
        else return a*ans*ans;
    }
}
