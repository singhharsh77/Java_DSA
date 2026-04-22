import java.util.*;
// 1 ) aberivhjberiuv3fabcdefg
// result = abcdefg


// 2) bvwivbwvpqrstdsvv
// result = pqrst
public class find_Sequence_ALPHABET {
    public static void  main(String[] args){
        String s = "aberivhjberiuv3fabcdefg";
        
        String result = findSequence(s);
        System.out.println(result);
    }

    public static String findSequence(String s){
        int n = s.length();
         String longest = "";
        String current = "";
        for (int i = 0 ;i <n ;i++){
            if(i == 0 || s.charAt(i) == s.charAt(i-1)+1){
                current += s.charAt(i);
            }
            else{
                if(current.length() > longest.length()){
                    longest = current;
                }
                current = "" + s.charAt(i);
            }

            
        }
        return longest.length() > current.length() ? longest : current;
    }
}