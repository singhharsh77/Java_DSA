public class ReverseStringTwoPointer {
    public static String reverseString(String s) {
        if (s == null) return null;  // handle null case
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // olleh
        System.out.println(reverseString("abcd"));  // dcba
        System.out.println(reverseString("madam")); // madam
    }


}
