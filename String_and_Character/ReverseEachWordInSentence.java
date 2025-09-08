package String_and_Character;
import java.util.*;
public class ReverseEachWordInSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence which u want to reverse: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        StringBuilder ReverseStr = new StringBuilder();
        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            ReverseStr.append(reversedWord).append(" ");
        }
            System.out.print(ReverseStr.toString().trim());


    }
}
