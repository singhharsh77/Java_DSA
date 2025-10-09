package TwoDArray;

public class FindSumOfEachRowCol {

    public static void main(String[] args){
    int[][] martix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int n = martix.length; // rows
    int m = martix[0].length; // columns

    // print row sum

    for(int i = 0; i<n ; i++){
        int rowsum = 0;
        for(int j = 0; j<m; j++){
            rowsum += martix[i][j];
        }

        System.out.println("Sum of row " + i + " is: " + rowsum);
    }

    // print col sum

    for(int j = 0;j<m;j++){
        int colsum = 0;
        for(int i=0;i<n;i++){
            colsum += martix[i][j];
        }
        System.out.println("Sum of column " + j + " is: " + colsum);    
        }

    
}
}
