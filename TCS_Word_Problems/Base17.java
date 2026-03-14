// Given a maximum of four digits to the base 17(10 -> A, 11 -> B, 12 -> C, 16 -> G) as
// input, output its decimal value.
// Input:
// 23GF
// OUTPUT
// 10980
import java.util.*;
import java.util.Scanner;
// public class Base17 {
// 
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a base 17 number (up to 4 digits): ");
//         String str = sc.nextLine().toUpperCase();
//         int result = 0;
//         int base = 17;
// 
//         for(int i = 0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             int value= 0;
//             if(Character.isDigit(ch)){
//                 value = ch-'0';
//             }else{
//                 value = ch -'A' +10;
//             }
//             result = result*base+value;
//         }
//         System.out.println("The decimal value is: " + result);
//     }
// }
public class Base17 {// short versioin
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a base 17 number (up to 4 digits): ");
    String s = sc.nextLine().toUpperCase();

    int result = Integer.parseInt(s, 17);
    System.out.println("The decimal value is: " + result);
}
}
