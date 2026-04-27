// // leetcode 1002
// // 

// Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

// Example 1:

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: words = ["cool","lock","cook"]
// Output: ["c","o"]

import java.util.ArrayList;
import java.util.List;

public class FindCommonChar {
    public static void main(String[] args) {
        List<String> words = List.of("bella", "label", "roller");
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(List<String> words){

        int[] count = new int[26];

        for(char c : words.get(0).toCharArray()){
            count[c - 'a']++;
        }

        for(int i = 1 ;i < words.size();i++){
            int[] temp = new int[26];
            for(char c : words.get(i).toCharArray()){
                temp[c-'a']++;
            }
            for(int k = 0 ; k<26;k++){
                count[k] = Math.min(count[k], temp[k]);
            }
        }

        List<String> ans = new ArrayList<>();

        for(int i = 0 ;i<26;i++){
            while(count[i] > 0){
                ans.add(String.valueOf((char)(i + 'a')));
                count[i]--;
            }
        }
        return ans;
    }
}
