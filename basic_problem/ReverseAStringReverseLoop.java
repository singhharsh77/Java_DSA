import java.util.*;

public class ReverseAStringReverseLoop {
    public static String reverseString(String s){
        if(s==null){
            return null;
        }
        StringBuilder sb = new StringBuilder(); //String builder memory efficient h Coz vo purani me hi update krega new memory allocate nhi hogi 

        for(int i = s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("before reversed String: "+str);
        System.out.println("After reversed: "+reverseString(str));
    }
}
