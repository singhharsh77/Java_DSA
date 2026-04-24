// 3) concentric square
 	
//          4 4 4 4 4 4 4  
//         	4 3 3 3 3 3 4   
//         	4 3 2 2 2 3 4   
//         	4 3 2 1 2 3 4   
//         	4 3 2 2 2 3 4   
//         	4 3 3 3 3 3 4   
//         	4 4 4 4 4 4 4  
import java.util.*;
public class SquarePattern{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print(Pattern(n));
    }
    public static String Pattern(int n){
        StringBuilder sb = new StringBuilder();
        int size = 2*n-1;
        for(int i = 0 ; i<size;i++){
            for(int j = 0; j<size;j++){
                int min = Math.min(Math.min(i, size-1-i), Math.min(j, size-1-j));
                sb.append(n - min);

            }
            sb.append("\n");
        }
        return sb.toString();
    }   
}