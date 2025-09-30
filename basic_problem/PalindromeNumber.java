import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The number "+num+" is a palindrome.");
        } else {
            System.out.println("The number "+num+" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        while(num>0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num = num/10;

        }

        return original == reversed;

    }
}
