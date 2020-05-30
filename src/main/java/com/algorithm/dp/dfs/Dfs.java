package com.algorithm.dp.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class Dfs {


    Queue<Vertex> queue = new LinkedList<>();
    public void traverse(Vertex root){

        root.setVisited(true);
        System.out.println(root);
        queue.add(root);

        while (!queue.isEmpty()){
            Vertex currentVertex = queue.poll();

            for (Vertex v : currentVertex.getNeighbour()){
                if (!v.isVisited()) {
                    System.out.println(v);
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }


}
