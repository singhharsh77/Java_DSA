package TwoDArray;
import java.util.*;
public class SprialPrint {
    
    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        // Best case ho gaya apna
        if( matrix == null || matrix.length == 0) return result;
        // Worst case
        // sb samagri ho gai ye
        int row = matrix.length;
        int col = matrix[0].length;
        int startingRow = 0, endingRow = row-1;
        int startingCol = 0, endingCol= col-1;

        // ab condition kb tk chalega code (perfect conditioin)
        while(startingRow<=endingRow && startingCol<=endingCol){
// ab dekh row print krega to COL use krenge
// for starting row
            for(int index = startingCol; index<=endingCol; index++){
                result.add(matrix[startingRow][index]);
            }
            startingRow++;
// COl print krega to Row use krneka meri jaan HAAAAAAANNNAaa...
//for ending col
            for(int index = startingRow ; index<=endingRow ; index++){
                result.add(matrix[index][endingCol]);
            }
            endingCol--;

// bottom last COL se bottom first COL
            if (startingRow <= endingRow) {
            for(int index = endingCol; index>=startingCol; index--){
                result.add(matrix[endingRow][index]);
            }
            endingRow--;
            }
            if (startingCol <= endingCol) {
            for(int index = endingRow; index>=startingRow; index--){
                result.add(matrix[index][startingCol]);
            }
            startingCol++;
            }
        }
        return result;
        
    }
    public static void main(String[] args){
    int[][] matrix = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };

        System.out.println(SprialPrint.spiralOrder(matrix));

}
}


    

