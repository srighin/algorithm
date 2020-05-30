package com.algorithm.dp.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private Vertex root;

    public void bfs (Vertex root){
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);

        queue.add(root);
        while (!queue.isEmpty()){
            Vertex vertex = queue.remove();
            System.out.println(vertex);

            for (Vertex v: vertex.getNeighbour()){
                if (! v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
