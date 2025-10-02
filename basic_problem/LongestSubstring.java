import java.util.*;

public class LongestSubstring  {

    public static int lengthOfLongestSubstring(String str){
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for(int right = 0; right<= str.length() -1 ;right++){
            char c = str.charAt(right);

            while(set.contains(c)){
                set.remove(str.charAt(left));
                left++;

            }

            set.add(c);
            maxLen = Math.max(maxLen, right-left +1);
                }
                return maxLen;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int result = lengthOfLongestSubstring(str);

        System.out.println("Length of longest substring without repeating characters: " + result);

                sc.close();

    }    
}
