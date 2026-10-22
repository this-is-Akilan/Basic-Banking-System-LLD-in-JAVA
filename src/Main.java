import java.lang.foreign.SymbolLookup;
import java.util.PrimitiveIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}



class sudukoSolver{

    public void solveSuduko(char[][] board){
        solve(board, 0);
    }
    public void printBoard(char[][] board){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
    private boolean solve (char[][] board, int depth){
        String indent = " ".repeat(depth);
        for(int row = 0; row<9; row++){
            for(int col = 0; col<9; col++){
                if(board[row][col] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if(isSafe(board, row, col, ch)){
                            System.out.println( indent + "Trying " + ch + "at (" + row + "," + col + ")" );
                            board[row][col] = ch;
                            if (solve(board, depth + 1)) return true; //path worked
                            // backtrack
                            System.out.println(indent + "Backtracking from ( " + row + "," + col + ")" );
                            board[row][col] = '.';            // backtrack and mentioned .
                        }
                    }
                    return false; // no valid digit found .
                }
            }
        }
        return true;
    }

    private boolean isSafe(char[][] board, int row, int col, char ch){
        for(int i = 0; i<9; i++){
            if(board[row][i] == ch || board[i][col] == ch) return false;
            int boxRow = 3 * (row/3) + i/3;
            int boxCol = 3  * (col/3) + i%3;
            if(board[boxRow][boxCol] == ch) return false;
        }
        return true;
    }

    public static void main(String args[]){
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        sudukoSolver solver = new sudukoSolver();
        solver.printBoard(board);
        solver.solveSuduko(board);
        System.out.println("solved");
        solver.printBoard(board);
    }
}


class NQueens{

}