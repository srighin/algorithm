package algo.graph;


import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean isVisited;
    private List<Vertex> neighbour;

    public Vertex(int data) {
        this.data = data;
        this.neighbour = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        this.neighbour.add(vertex);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(List<Vertex> neighbour) {
        this.neighbour = neighbour;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
