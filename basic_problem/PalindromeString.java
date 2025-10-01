import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("The string \""+str+"\" is a palindrome.");
        } else {
            System.out.println("The string \""+str+"\" is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length();
        while(left<right){
            if(str.charAt(left) != str.charAt(right -1)){
                return false;
            }else{
                left++;
                right--;
            }
           
        } return true;
    }
}
