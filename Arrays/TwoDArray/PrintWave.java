package TwoDArray;
public class PrintWave {
    public static void printWave(int[][] matrix, int nRows, int mCols){
        for(int col = 0;col<mCols;col++){
            if(col % 2 == 1){
                for(int row = nRows-1;row>=0;row--){
                    System.out.print(matrix[row][col]+" ");
                }
            }
                else{
                    for(int row = 0; row<nRows;row++){
                        System.out.print(matrix[row][col]+" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int nRows = matrix.length;
        int mCols = matrix[0].length;
        printWave(matrix,nRows,mCols);
    }
    
}
