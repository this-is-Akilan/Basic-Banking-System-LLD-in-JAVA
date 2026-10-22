package TCS_CODE_VITA;
import java.util.*;
public class Count_the_Shapes {
//    OOPS impleee
    static Map<String, List<String>> graphFig = new HashMap<>();

    static void addEdge(String u, String v) {
        graphFig.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graphFig.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static int compoCount() {
        Set<String> visited = new HashSet<>();
        int components = 0;

        for (String node : graphFig.keySet()) {
            if (!visited.contains(node)) {
                components++;
                Queue<String> q = new LinkedList<>();
                q.add(node);
                visited.add(node);
                while (!q.isEmpty()) {
                    String cur = q.poll();
                    for (String nbr : graphFig.get(cur)) {
                        if (!visited.contains(nbr)) {
                            visited.add(nbr);
                            q.add(nbr);
                        }
                    }
                }
            }
        }
        return components;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = 0;
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            String u = x1 + "," + y1, v = x2 + "," + y2;
            addEdge(u, v);
            e++;
        }

        int V = graphFig.size();
        int C = compoCount();

        int closedFigures = e - V + C;
        System.out.println(closedFigures);
    }
}




