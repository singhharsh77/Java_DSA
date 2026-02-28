// Problem Description -: In this 3 Palindrome, Given an input string word, split the string into
// exactly 3 palindromic substrings. Working from left to right, choose the smallest split for the first
// substring that still allows the remaining word to be split into 2 palindromes.
// Similarly, choose the smallest second palindromic substring that leaves a third palindromic substring.
// If there is no way to split the word into exactly three palindromic substrings, print “Impossible”
// (without quotes). Every character of the string needs to be consumed.
// Cases not allowed –
// After finding 3 palindromes using above instructions, if any character of the original string remains
// unconsumed.
// No character may be shared in forming 3 palindromes.
// Constraints
// 1 <= the length of input sting <= 1000
// Input
// First line contains the input string consisting of characters between [a-z].
// Output
// Print 3 substrings one on each line.
// Time Limit
// 1
// 
// Examples
// Input -> nayannamantenet
// Output->
// nayan
// naman
// telnet

import java.util.*;
public class ThreePalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        // String word = "nayannamantenet";
        String word = sc.next();

        int n = word.length();

        for(int i =1; i<n-1 ; i++){
            String first = word.substring(0, i);
            if(isPalindrome(first)){
                for(int j = i+1; j<n ; j++){
                    String second = word.substring(i,j);
                    String third = word.substring(j);

                    if(isPalindrome(second) && isPalindrome(third)){
                        System.out.println(first);
                        System.out.println(second);
                        System.out.println(third);
                        return;
                    }
                    
                }
            }
        }

    }

    public static boolean isPalindrome(String str){
    int left = 0;
    int right = str.length() - 1;   
    while(left < right){
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}
