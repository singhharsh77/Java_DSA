//Q7. The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or
//messages is shifted by a number of places down the alphabet.
//For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on. To pass an
//encrypted message from one person to another, it is first necessary that both parties have the ‘Key’
//for the cipher, so that the sender may encrypt and the receiver may decrypt it. Key is the number of
//OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26
//total alphabets.
//As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric
//digits from 0 to 9. Digits can also be shifted by key places.
//For Example, if a given plain text contains any digit with values 5 and key =2, then 5 will be replaced
//by 7, “- ”(minus sign) will remain as it is.
//Key value less than 0 should result into “INVALID INPUT”
//Example 1: Enter your Plaintext: All the best
//Enter the Key: 1
//The encrypted Text is: Bmm uif Cftu


import java.util.*;
public class encrypt {
    public static void main(String[] args) {
    //number input le liya 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = sc.nextLine();
    // ab key input lenge
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        if(key < 0 ){
            System.out.println("INVALID INPUT");
            return;
        }
        String encrypted = "";


        for(int i = 0 ; i<text.length(); i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                char e = (char)(((c - 'A' + key) % 26) + 'A');
                encrypted += e;
            }
            else if(Character.isLowerCase(c)){
                char e = (char)(((c - 'a' + key) % 26) + 'a');
                encrypted += e;
            }
            else if(Character.isDigit(c)){
                char e = (char)(((c - '0' + key) % 10) + '0');
                encrypted += e;
            }
            else{
                encrypted += c;
            }
            }
                    System.out.println("The encrypted Text is: " + encrypted);

        }
    }