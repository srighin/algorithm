package algo.graph.bfs;

import algo.graph.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public void bfs(Vertex root) {

        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex vertex = queue.remove();
            System.out.print(vertex.toString()+"  ");
            for (Vertex v: vertex.getNeighbour()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
        System.out.println();
    }
}
