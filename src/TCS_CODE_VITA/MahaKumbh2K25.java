package TCS_CODE_VITA;

import java.util.*;

public class MahaKumbh2K25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        // graph initialization
        Map<String, Set<String>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            String src = parts[0];
            graph.putIfAbsent(src, new HashSet<>());
            for (int j = 1; j < parts.length; j++) {
                String dest = parts[j];
                graph.putIfAbsent(dest, new HashSet<>());
                graph.get(src).add(dest);
                graph.get(dest).add(src);
            }
        }

        // queries../...
        int Q = Integer.parseInt(sc.nextLine().trim());
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            queries.add(sc.nextLine().trim());
        }

        // restrictions..../...
        int R = Integer.parseInt(sc.nextLine().trim());
        Map<String, Set<String>> restrictions = new HashMap<>();
        for (int i = 0; i < R; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            String src = parts[0];
            restrictions.putIfAbsent(src, new HashSet<>());
            for (int j = 1; j < parts.length; j++) {
                restrictions.get(src).add(parts[j]);
            }
        }

        // process queries
        for (String query : queries) {
            String[] parts = query.split("\\s+");
            if (query.contains(" connects ")) {
                String a = parts[0];
                String b = parts[2];
                graph.putIfAbsent(a, new HashSet<>());
                graph.putIfAbsent(b, new HashSet<>());
                graph.get(a).add(b);
                graph.get(b).add(a);
            } else if (query.contains(" disconnects ")) {
                String a = parts[0];
                String b = parts[2];
                if (graph.containsKey(a)) graph.get(a).remove(b);
                if (graph.containsKey(b)) graph.get(b).remove(a);
            } else if (query.contains(" to ")) {
                String src = parts[0];
                String dest = parts[2];
                if (canTravel(graph, restrictions, src, dest)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }

//    how much it would travel is shown here

    private static boolean canTravel(Map<String, Set<String>> graph, Map<String, Set<String>> restrictions,
                                     String src, String dest) {
        if (!graph.containsKey(src) || !graph.containsKey(dest)) return false;
        Set<String> restricted = restrictions.getOrDefault(src, new HashSet<>());
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(src);
        visited.add(src);

        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.equals(dest)) return true;

            for (String next : graph.getOrDefault(curr, new HashSet<>())) {
                if (!visited.contains(next) && !restricted.contains(next)) {
                    visited.add(next);
                    q.add(next);
                }
            }
        }
        return false;
    }
}

