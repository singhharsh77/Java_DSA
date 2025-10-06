package TwoDArray;

public class RotateArrayNINTYdegree {
// my aproach was to traverse to all elements of first row and then place them in last coloumn and so on
//then row++ and lastcol-- and so on
// optimised nhi h

//better approach h ki Transpose krdo fir reverse krdo rows ko
//Transpose krne k liye matrix[i][j] ko matrix[j][i] me swap krdo
// fir har row ko reverse krdo
//O(n^2)
//O(1)

    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;

        //step 1 h transpose krna
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){

                //ab kr denge SWAP
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // ab transpose ka reverse kr denge
        for(int i=0; i<n;i++){
            for(int j = 0; j< n/2 ;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
     
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // RotateArrayNINTYdegree sc = new RotateArrayNINTYdegree();
        // sc.rotate(matrix);
        System.out.print("Original Matrix:\n");
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        //function call kre ab rotate ho gaya
        rotate(matrix);
        System.out.print("Rotated Matrix:\n");
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
    

