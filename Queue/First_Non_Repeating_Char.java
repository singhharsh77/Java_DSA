package Queue;
import java.util.*;
public class First_Non_Repeating_Char {
    public static void main(String[] args){
        String s = "aabccxb";
        printNonRepeating(s);
        
    }

    public static void printNonRepeating(String str){
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(char c:str.toCharArray()){
            q.add(c);
            freq[c-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.print(q.peek()+" ");
    }
}
