package TwoDArray;

public class SearchInTwoDMatrix {
    //Input: matrix = [[1,3,5,7],
                    //[10,11,16,20],
                    //[23,30,34,60]], 
                    //target = 3
    //Output: true

    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int target = 7;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row*col-1;

        int mid = start+(end-start)/2;

        while(start<=end){
            

            int element = matrix[mid/col][mid%col];

            if(element == target){
                return true;
            }

            if(element<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            mid = start+(end-start)/2;

        }
        return false;
    }
}
