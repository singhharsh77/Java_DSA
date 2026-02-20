//Given a string S (input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is
//to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered
//valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
//Note: The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the
//input string.
//(*>#): positive integer
//(#>*): negative integer
//(#=*): 0
//Example 1:
//Input 1: ###*** -> Value of S
//Output : 0 → number of * and # are equal

//input : *#*#**###
// output : -1

// Online Java Compiler

// Use this editor to write, compile and run your Java code online

import java.util.*;



class Star_OR_Hash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        if(sc.hasNext()){

            String s = sc.next();

            int count = 0;

            for(int i = 0 ; i<s.length() ; i++){

             if(s.charAt(i) == '*'){

                 count++;

             }else if(s.charAt(i) == '#'){

                 count--;

             }   

             

            }

            

            System.out.print(count);

        }

sc.close();

    }

}