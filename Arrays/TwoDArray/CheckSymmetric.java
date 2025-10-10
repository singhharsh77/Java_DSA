package TwoDArray;

public class CheckSymmetric {

    public static void main(String[] args){
        // I/P
        int[][] matrix = {
            {1,2,3,4,5},
            {2,7,8,9,10},
            {3,8,13,14,15},
            {4,9,14,19,20},
            {5,10,15,20,25}
        };

        //O/P
        //Matrix is symmetric: true

        int n = matrix.length; //row 
        int m = matrix[0].length;

        if(m!=n){
            System.out.println("Matrix is not symmetric");
            return;
        }

        boolean isSymmetric = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
        }
        System.out.println("Matrix is symmetric: " + isSymmetric);
    }
    
}
