package dbs;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("ABC", 2));
        humans.add(new Human("CDR", 22));
        humans.add(new Human("SWE", 12));

        List<Human> resultList = new ArrayList<>();

        int [] scores = {2, 22, 12, 59, 13, 15};

        for (int i =0 ; i< scores.length; i++){

            for(int j=i+1; j< scores.length; j++){
                if (scores[i] > scores[j]){
                    swap(scores, i, j);
                }
            }
        }

        for (int i=0; i< scores.length; i++){
            System.out.println(scores[i]);
        }
    }

    private static void swap(int[] scores, int ith, int jth) {
        int temp = scores[ith];
        scores[ith] = scores[jth];
        scores[jth] = temp;

    }
}



class Human implements Comparable<Human>{
    private String name;
    private int score;

    public Human(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Human otherHuman) {
        return this.score > otherHuman.score ? 1 : -1;
    }
}
