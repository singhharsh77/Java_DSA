// I received a follow up question from the interviewer which was as follows: Q3: 
// Given a string, find out the character that was repeated second highest number of times. 
// Print the character along with the number of its occurences. EG: "abccaddbdcaasdd". 
// In the above string: a -> 4 times b -> 2 times c -> 3 times d -> 5 times s -> 1 time 
// Since d occurs highest number of times (5) 
// and a occurs second highest number of times (4), so print "a 4"

import java.util.*;
public class countSecondHighFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Character with second highest frequency: " + findSecondHighFreq(s));
    }

    private static String findSecondHighFreq(String s){
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        int max = 0;
        int secondMax = 0 ;
        char maxChar = ' ', secondMaxChar = ' ';

        for(int i = 0 ;i<26 ;i++){
            int f = freq[i];
                if(f>0){
                char ch = (char)(i+'a');

            if(f>max){
                secondMax = max;
                max = f;
                secondMaxChar = maxChar;
                maxChar = ch;
            }
            else if(f> secondMax && f!= max){
                secondMax = f;
                secondMaxChar = ch;
            }
            
        }
        }
        return secondMaxChar + " " + secondMax;

    }


}
