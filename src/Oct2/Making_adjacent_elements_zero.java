package Oct2;
import java.util.*;

public class Making_adjacent_elements_zero {
    public static void main(String[] args) {
//        int[][] grid = {{1, 2, 3}, {4, 1, 6}, {7, 8, 9}};
        int[][] grid = {{1, 0, 3, 4}, {0, 1, 0, 7}, {8, 0, 1, 10}};
        int[][] ans =  makingAdjZero(grid);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] makingAdjZero(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;

        int result[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                result[i][j] = grid[i][j];
            }
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if (grid[i][j] == 1) {
                    if (i - 1 >= 0){
                        result[i - 1][j] = 0;
                    }

                    if (i + 1 < row){
                        result[i + 1][j] = 0;
                    }

                    if (j - 1 >= 0){
                        result[i][j - 1] = 0;
                    }

                    if (j + 1 < col){
                        result[i][j + 1] = 0;
                    }
                }
            }
        }
        return result;
    }
}
