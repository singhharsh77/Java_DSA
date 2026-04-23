// They have given two questions which was based on simple array string 1. check weather matrix is upper diagonal or not 
import java.util.*;

public class UpperDiagonalMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();    
        int[][] matrix = new int[rows][cols];
        for(int i = 0 ;i<rows ;i++){
            for(int j = 0 ;j<cols ;j++){
                System.out.print("Enter the element at position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }



        if(isUpperDiagonal(matrix)){
            System.out.println("The matrix is an upper diagonal matrix.");
        } else {
            System.out.println("The matrix is not an upper diagonal matrix.");
        }
    }
    public static boolean isUpperDiagonal(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(i>j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
