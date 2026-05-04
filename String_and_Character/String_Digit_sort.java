package String_and_Character;
import java.util.*;
// i/p v8c1z3d0
// o/p 0c1dv3z8

public class String_Digit_sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Result : " + Result(str));

    }

    public static String Result(String str){
        List<Character> letter = new ArrayList<>();
        List<Character> digit = new ArrayList<>();

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)) {
                digit.add(c);
            }else{
                letter.add(c);
            }
        }

        if(Math.abs(letter.size() - digit.size()) > 1){
            return "" ;
        }

        Collections.sort(letter);
        Collections.sort(digit);


        int i = 0 , j = 0 ;
        StringBuilder result = new StringBuilder();
        while(i<digit.size() || j < letter.size()){
            result.append(digit.get(i++));
            result.append(letter.get(j++));
        }

        return result.toString();
    }

}