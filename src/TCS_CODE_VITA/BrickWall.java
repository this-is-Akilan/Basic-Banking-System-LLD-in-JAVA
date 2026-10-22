package TCS_CODE_VITA;

import java.io.*;
import java.util.*;

public class BrickWall {
    static class Node {
        int r, c, cost;
        Node(int r, int c, int cost) {
            this.r = r;
            this.c = c;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.isEmpty()) return;
        int N = Integer.parseInt(line.trim());

        char[][] grid = new char[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s == null) s = "";
            s = s.trim();
            int col = 0, j = 0;

            while (j < s.length() && col < N) {
                int num = 0;
                // parse number
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    num = num * 10 + (s.charAt(j) - '0');
                    j++;
                }
                if (j >= s.length()) break;

                char ch = s.charAt(j++);
                for (int k = 0; k < num && col < N; k++) {
                    grid[i][col++] = ch;
                }
            }
        }

        // find Source (S) and Destination (D)
        int sr = -1, sc = -1, dr = -1, dc = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'S') { sr = i; sc = j; }
                else if (grid[i][j] == 'D') { dr = i; dc = j; }
            }
        }

        System.out.println(findMinBreaks(grid, sr, sc, dr, dc));
    }

    static int findMinBreaks(char[][] grid, int sr, int sc, int dr, int dc) {
        int n = grid.length;
        int[][] dist = new int[n][n];
        for (int[] d : dist) Arrays.fill(d, Integer.MAX_VALUE);

        Deque<Node> dq = new ArrayDeque<>();
        dq.offerFirst(new Node(sr, sc, 0));
        dist[sr][sc] = 0;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!dq.isEmpty()) {
            Node cur = dq.pollFirst();
            int r = cur.r, c = cur.c, cost = cur.cost;

            if (r == dr && c == dc) return cost;
            if (cost > dist[r][c]) continue;

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nc < 0 || nr >= n || nc >= n) continue;

                char brick = grid[nr][nc];
                if (brick == 'R') continue;

                int newCost = cost + (brick == 'G' ? 1 : 0);
                if (newCost < dist[nr][nc]) {
                    dist[nr][nc] = newCost;
                    if (brick == 'G')
                        dq.offerLast(new Node(nr, nc, newCost));
                    else
                        dq.offerFirst(new Node(nr, nc, newCost));
                }
            }
        }

        return -1; // unreachable
    }
}
