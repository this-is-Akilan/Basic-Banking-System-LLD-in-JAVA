package TCS_CODE_VITA;
import java.util.*;

public class Mirror_maze {

//    OOPS imple

    //  0 ==== up 1 ==== right 2 ===== down 3 ==== left

    // Row movements
    static int[] dirRow = {-1, 0, 1, 0};

    // Col movements

    static int[] dirCol = {0, 1, 0, -1};
    static int m, n;

    // Function to get the new direction after hitting a mirror
    static int reflect(char mirror, int dir) {
        // For this / mirror
        if (mirror == '/') {
            // up to right
            if (dir == 0) return 1;
            // right to up
            if (dir == 1) return 0;
            // down to left
            if (dir == 2) return 3;
            // left to down
            if (dir == 3) return 2;
        }
        // For this \ mirror
        if (mirror == '\\') {
            if (dir == 0) return 3;
            // up to left
            if (dir == 1) return 2;
            // right to down
            if (dir == 2) return 1;
            // down to right
            if (dir == 3) return 0;
            // left to up
        }
        // If no mirror.....then.... direction doesn't change
        return dir;
    }

    // Main loop detection logic
    static int findMaxLoop(char[][] grid) {
        int maxLoop = 0;
        // Visited per cell aproom per direction...rendum pocha illaya nu paka
        boolean[][][] visited = new boolean[m][n][4];

        //  starting from every cell aaand  every direction
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] != '0') {
                    for (int d = 0; d < 4; d++) {
                        maxLoop = Math.max(maxLoop, explore(grid, r, c, d, visited));
                    }
                }
            }
        }
        return maxLoop;
    }

    // Explore path starting from r,c in direction d
    static int explore(char[][] grid, int sr, int sc, int sd, boolean[][][] visited) {
        int r = sr, c = sc, d = sd;
        Map<String, Integer> path = new HashMap<>();
        int steps = 0;

        for(int j = 0; j<10; j++){

        }

        while (true) {
            String key = r + "," + c + "," + d;
            if (path.containsKey(key)) {
                // loop found
                return steps - path.get(key);
            }
            // If visited before.....then..,.. no loop possible
            if (visited[r][c][d]) break;
            visited[r][c][d] = true;
            path.put(key, steps);
            steps++;

            // Calculating nexct direction
            d = reflect(grid[r][c], d);
            r += dirRow[d];
            c += dirCol[d];

            // Out of bounds======== stop search
            if (r < 0 || r >= m || c < 0 || c >= n) break;
            if (grid[r][c] == '0') break;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to the MirrorMaze explorer!");

        m = sc.nextInt();
        n = sc.nextInt();
        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int result = findMaxLoop(grid);
        System.out.println(result);

//        eeeheheh over uh
        System.out.println("Exploration complete. Have a nice day!");
    }
}
