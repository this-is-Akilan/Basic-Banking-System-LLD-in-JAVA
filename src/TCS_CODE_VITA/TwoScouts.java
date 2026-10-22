package TCS_CODE_VITA;

import java.io.*;
import java.util.*;

public class TwoScouts {
    static class State implements Comparable<State> {
        int a, b, mask, cost;
        State(int a, int b, int mask, int cost) {
            this.a = a;
            this.b = b;
            this.mask = mask;
            this.cost = cost;
        }
        public int compareTo(State o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().trim().split("\\s+");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        List<Integer>[] g = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) g[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String[] p = br.readLine().trim().split("\\s+");
            int u = Integer.parseInt(p[0]), v = Integer.parseInt(p[1]);
            g[u].add(v);
            g[v].add(u);
        }

        String[] sline = br.readLine().trim().split("\\s+");
        int s1 = Integer.parseInt(sline[0]);
        int s2 = Integer.parseInt(sline[1]);
        int dest = Integer.parseInt(br.readLine().trim());

        int ans = solve(g, N, s1, s2, dest);
        System.out.println(ans == Integer.MAX_VALUE ? "Impossible" : ans);
    }

    static int solve(List<Integer>[] g, int N, int s1, int s2, int dest) {
        int maxMask = 1 << N;
        int[][][] dist = new int[N + 1][N + 1][maxMask];
        for (int[][] a : dist) for (int[] b : a) Arrays.fill(b, Integer.MAX_VALUE);

        int mask = (1 << (s1 - 1)) | (1 << (s2 - 1));
        dist[s1][s2][mask] = Integer.bitCount(mask);
        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.add(new State(s1, s2, mask, Integer.bitCount(mask)));

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int a = cur.a, b = cur.b, m = cur.mask, cost = cur.cost;

            if (a == dest && b == dest) return cost - 1; // count dest once

            if (cost > dist[a][b][m]) continue;

            List<Integer> nextA = new ArrayList<>(g[a]);
            List<Integer> nextB = new ArrayList<>(g[b]);
            nextA.add(a); // option to stay
            nextB.add(b); // option to stay

            for (int na : nextA) {
                for (int nb : nextB) {
                    if (na == nb && na != dest) continue; // can't meet elsewhere

                    int newMask = m;
                    if ((newMask & (1 << (na - 1))) == 0) newMask |= (1 << (na - 1));
                    if ((newMask & (1 << (nb - 1))) == 0) newMask |= (1 << (nb - 1));
                    int newCost = Integer.bitCount(newMask);

                    if (newCost < dist[na][nb][newMask]) {
                        dist[na][nb][newMask] = newCost;
                        pq.add(new State(na, nb, newMask, newCost));
                    }
                }
            }
        }

        return Integer.MAX_VALUE;
    }
}


