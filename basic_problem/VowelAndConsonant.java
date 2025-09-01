import java.util.*;
public class VowelAndConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int vowel = 0 , consonant = 0;

        str = str.toLowerCase();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                if("aeiou".indexOf(ch) != -1){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("vowel: "+ vowel);
        System.out.println("Consonant: "+consonant);

    }
}
