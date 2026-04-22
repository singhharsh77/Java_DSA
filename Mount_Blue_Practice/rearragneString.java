//Q2: Rearrange the string of given words according to indices contained inside the words.
//  EG: "God5 t2he 1For lov3e o4f" -> "For the love of God" The indices are attached with the word but can be
//  given at any position in the word.
import java.util.*;
public class rearragneString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        System.out.println("Rearranged string: " + rearrange(s));

    }

    public static String rearrange(String s){
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for(String word : words){
            int index = 0;
            String clean = "";
            for(char c : word.toCharArray()){
                if(Character.isDigit(c)){
                    index = c-'0';
                }else{
                    clean += c;
                }
            }
            

            result[index - 1] = clean;
        }
        return String.join(" ", result);    
    }
}
