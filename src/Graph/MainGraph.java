package Graph;
import java.util.*;
public class MainGraph {
    public static void main(String[] args) {

        int nodes = 10;
        Graph graph = new Graph(nodes);

        int edges = 9;

        Scanner in = new Scanner(System.in);

        for(int i = 0 ; i < edges ; i++){
            int u = in.nextInt();
            int v = in.nextInt();
            graph.addEdge(u,v);
        }

        graph.display();
        graph.dfs(1);

    }
}
