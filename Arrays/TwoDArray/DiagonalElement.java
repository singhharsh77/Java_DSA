package TwoDArray;

public class DiagonalElement {
//Diagonal element print krne h 
//11,22,33,44
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int n = matrix.length;// rows 4 h
        for(int i=0; i<n; i++){
            System.out.print(matrix[i][i] +" ");
        }


          System.out.println();
        }
    }

    

