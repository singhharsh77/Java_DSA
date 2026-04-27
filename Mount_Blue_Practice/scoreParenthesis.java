// // leetcode 856
// Given a balanced parentheses string s, return the score of the string.

// The score of a balanced parentheses string is based on the following rule:

// "()" has score 1.
// AB has score A + B, where A and B are balanced parentheses strings.
// (A) has score 2 * A, where A is a balanced parentheses string.
 

// Example 1:

// Input: s = "()"
// Output: 1
// Example 2:

// Input: s = "(())"
// Output: 2
// Example 3:

// Input: s = "()()"
// Output: 2
 

// Constraints:

// 2 <= s.length <= 50
// s consists of only '(' and ')'.
// s is a balanced parentheses string.
import java.util.*;
import java.util.Scanner;
public class scoreParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parentheses: ");
        String str = sc.nextLine();
        System.out.println("The score of the string is: " + scoreOfParentheses(str));
    }

    private static int scoreOfParentheses(String s){
        Stack<Integer> stack = new Stack<>();

        int score = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(score);
                score = 0;
            }
            else{
               // score = stack.pop() + Math.max(score*2, 1);
                if(score == 0){
                    score =1;
                }
                else{
                    score *= 2;
                    
                }
                score += stack.pop();
            }
        }
        return score;
        
    }

}