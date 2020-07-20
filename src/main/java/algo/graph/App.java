package algo.graph;

import algo.graph.bfs.Bfs;
import algo.graph.dfs.Dfs;

public class App {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighbour(v2);
        v1.addNeighbour(v4);
        v4.addNeighbour(v5);
        v2.addNeighbour(v3);

        // BFS Implementation
       /* Bfs bfs = new Bfs();
        bfs.bfs(v1);*/

        // DFS Implementation
        Dfs dfs = new Dfs();
        dfs.dfs(v1);
    }
}
