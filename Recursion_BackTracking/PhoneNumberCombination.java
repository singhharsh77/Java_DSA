package Recursion_BackTracking;
// Example 1:
// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

import java.util.ArrayList;
import java.util.List;

// Example 2:
// Input: digits = "2"
// Output: ["a","b","c"]
 
public class PhoneNumberCombination {
    public static void main(String[] args){
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println();
        System.out.println(result);
        System.out.println();

    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits==null || digits.length()==0) return ans;
        //output current value store kr rha h (pointer smjh ise)
        String output = "";

        int index=0;

        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxys"};

        solve(digits,output,index,ans,mapping);
        return ans;
    }

    public static void solve(String digits,String output, int index, List<String> ans,String[] mapping){
            //base case marenge pehele ki
            if(index >= digits.length()){
                ans.add(output);
                return ;
            }
            // jo string pr number h e.g. "2" ye use digit 2 me convert krega
            int number = digits.charAt(index) - '0';
            //ab ise number ko mapping me index ki trh use kro aur related string dhoondo
            String value = mapping[number];

            //ab sb explore krlo
            for(int i=0; i<value.length();i++){
                solve(digits, output + value.charAt(i) , index+1 , ans, mapping);
            }

    }
}
