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
            System.out.println("First non Repeated character is : "+result);
        }else{
            System.out.println("No Non-Repeated Values Found!");
        }



 // BEST METHOD ya fir sare characters ko leke XOR kr do lower case kr k
// Example A^A =0  , b^b = 0 end me sirf non repeated character hi bachega.... hahahaha
//     public static char unique(String str) {
//         char ans = 0;
//         for (int i = 0; i < str.length(); i++) {
//             ans = (char)(ans ^ str.charAt(i)); // XOR characters
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "abbaccd";  // here 'd' is unique

//         char result = unique(str);
//         System.out.println("The non-repeated character is: " + result);
//     }
// }

            sc.close();

    }

}
