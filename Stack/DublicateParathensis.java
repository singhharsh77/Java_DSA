// Below expressions have duplicate parenthesis - 
// ((a+b)+((c+d)))
// The subexpression "c+d" is surrounded by two
// pairs of brackets.

// (((a+(b)))+(c+d))
// The subexpression "a+(b)" is surrounded by two 
// pairs of brackets.

// (((a+(b))+c+d))
// The whole expression is surrounded by two 
// pairs of brackets.

// ((a+(b))+(c+d))
// (b) and ((a+(b)) is surrounded by two
// pairs of brackets but, it will not be counted as duplicate.

// Below expressions don't have any duplicate parenthesis -
// ((a+b)+(c+d)) 
// No subexpression is surrounded by duplicate
// brackets.
import java.util.*;
public class DublicateParathensis {
    public static void main(String[] args){
        String s = "((a+b))";
        System.out.println(isDuplicate(s));
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s =new Stack<>();
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
                
            }
            else{
                s.push(ch);
            }

        }
        return false;
    }
}
