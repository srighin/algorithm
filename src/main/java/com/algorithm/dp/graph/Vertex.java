package com.algorithm.dp.graph;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Vertex {

    private int data;
    private boolean visited;
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
