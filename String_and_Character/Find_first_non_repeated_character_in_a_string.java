package String_and_Character;
import java.util.*;
public class Find_first_non_repeated_character_in_a_string {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str = sc.nextLine();
    
    HashMap<Character,Integer> counts = new HashMap<>();

    for(int i = 0; i<str.length();i++){
        char ch = str.charAt(i);

        counts.put(ch, counts.getOrDefault(ch, 0) + 1);
    }
        char result = 0;
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(counts.get(ch) == 1){
                result = ch;
                break;
            }

        }
        if(result!=0){
            System.out.println("First non Repeated number: "+result);
        }else{
            System.out.println("No Non-Repeated Values Found!");
        }
    
    }

}
