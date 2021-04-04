package com.algorithm.dp.graph;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


public class Vertex {

    private int data;
    private boolean visited;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(List<Vertex> neighbour) {
        this.neighbour = neighbour;
    }

    private List<Vertex> neighbour;

    public Vertex(int data) {
        this.data = data;
        neighbour = new ArrayList<>();
    }

    public void addNeighbour (Vertex vertex){
        this.neighbour.add(vertex);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }
}
