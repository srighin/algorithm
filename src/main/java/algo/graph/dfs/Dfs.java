package algo.graph.dfs;

import algo.graph.Vertex;

public class Dfs {

    public void dfs(Vertex vertex){

        System.out.print(vertex.toString());
        for(Vertex v: vertex.getNeighbour()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfs(v);
            }
        }
        System.out.println();
    }
}
