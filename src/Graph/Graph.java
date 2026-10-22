package Graph;

import java.util.*;

/**
 * what i have done is here
 * for undirected graph
 *
 */

public class Graph {
    private int vertex;
    private ArrayList<ArrayList<Integer>> adj;

//    constructor
    public Graph(int vertex){
        this.vertex = vertex;
        adj = new ArrayList<>();

        for(int i = 0 ; i < vertex ; i++){
            adj.add(new ArrayList<>());
        }
    }

//    add edges

    public void addEdge(int u , int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

//    display

    public void display(){
        for(int i = 0 ; i < vertex ; i++){
            System.out.print(i + "->");
            for(int neighbor : adj.get(i)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

//    BFS Traversal

    public void bsf(int start){
        boolean[] visited = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");
            for(int neighbor : adj.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

//    DFS Traversal ---- recursive approach

    public void dfs(int start){
        boolean[] visited = new boolean[vertex];
//        method overloading
        dfs(start , visited);
    }

    private void dfs(int node , boolean[] visited){
        visited[node] = true;
        System.out.print(node + " ");

        for(int near : adj.get(node)){
            if(!visited[near]){
                dfs(near , visited);
            }
        }
    }
}
