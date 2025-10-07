package TwoDArray;

public class SearchInTwoDMatrixLvlTWO {
    public static void mani(String[] args){
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int target = 7;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    
    int row = 0;
    int col = m - 1;  // top-right corner
    
    while(row < n && col >= 0){
        if(matrix[row][col] == target) return true;
        else if(matrix[row][col] > target) col--;  // move left
        else row++;                               // move down
    }
    return false;
}
}
