package String_and_Character;
import java.util.*;
public class Remove_dublicate_from_string {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for(int i =0; i<str.length() ;i++){
            char ch = str.charAt(i);

            if(!seen.contains(ch)){
                seen.add(ch);
                result.append(ch);
            }
        }
        System.out.println("After Removing The Dublicates: "+ result.toString());
    }

}