package String_and_Character;
import java.util.*;
public class Count_Occ_In_String {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> CharCount = new HashMap<>();

        for(int i = 0 ;i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }
            if(CharCount.containsKey(ch)){
                CharCount.put(ch, CharCount.get(ch)+1);
            }else{
                CharCount.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : CharCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }
}
