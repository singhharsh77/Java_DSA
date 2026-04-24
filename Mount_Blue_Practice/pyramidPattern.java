// Pattern 
//       1
//     121
//    12321
//   1234321
//  123454321

import java.util.*;
 public class pyramidPattern {
    public static void main(String[] args){

    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    System.out.print(Pattern(n));

   } 


   private static String Pattern(int n ){

    StringBuilder pattern = new StringBuilder();
    for(int i = 1; i<=n ;i++){

        for(int j = 1; j<=n-i; j++){
            pattern.append(" ");
        }

        for(int k = 1; k<=i; k++){
            pattern.append(k);
        }

        for(int l = i-1; l>=1; l--){
            pattern.append(l);
        }
        
        pattern.append("\n");   
    }
    return pattern.toString();
 }
}
