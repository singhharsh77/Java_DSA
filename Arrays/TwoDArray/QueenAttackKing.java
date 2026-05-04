// Input: queens = [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]], king = [0,0]
// Output: [[0,1],[1,0],[3,3]]
// Explanation: The diagram above shows the three queens that can directly attack the king and the three queens that cannot attack the king (i.e., marked with red dashes).
import java.util.*;
public class QueenAttackKing{
    public static void main(String[] args){
        int[][] Queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
        int[] king = {0,0};
        System.out.println(QueenAtk(Queens, king));
    }

    public static List<List<Integer>> QueenAtk (int[][] Queens, int[] King){
        List<List<Integer>> result = new ArrayList<>();

        boolean[][] board = new boolean[8][8];
        
        for(int[] queen : Queens){
            board[queen[0]][queen[1]] = true;
        }

        int[][] directions = {{-1,0}, {1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};

        for(int[] dir: directions){
            int x = King[0] + dir[0];
            int y = King[1] + dir[1];

            while(x>=0 && x<8 && y>=0 && y<8){
                if(board[x][y]){
                    result.add(Arrays.asList(x,y));
                    break;
                }
                x+=dir[0];
                y+=dir[1];
            }
        }
        return result;
    }
}