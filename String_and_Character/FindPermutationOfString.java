package String_and_Character;
import java.util.Scanner;
import java.util.*;
public class FindPermutationOfString {    
    public static void permute(String s, String result){
        if(s.length()==0){
            System.out.print(result);
            return ;
        }
        else{
            for(int i = 0;i<s.length(); i++){
                char ch = s.charAt(i);
                String leftpart = s.substring(0, i);
                String rightpart = s.substring(i+1);
                permute(leftpart+rightpart, result+ch);
            }
        }
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an String: ");
        String str = sc.nextLine();


        permute(str, " ");

    }    
}
