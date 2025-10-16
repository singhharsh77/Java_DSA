package Recursion_BackTracking;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        reverseString(charArray,0, charArray.length - 1);
        String reversed = new String(charArray);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }


    public static void reverseString(char[] str, int start, int end){

        if(start >= end) return ;

        // Swap characters
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        reverseString(str, start + 1, end - 1);


    }
}
