package leet;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        /*int [] asteroids = {5, 10, -5};*/
        int [] asteroids = {8, -8};
        /*int [] asteroids = {10, 2,  -5};*/
        /*int [] asteroids = {-2, -1, 1, 2};*/
        Object[] output = stateOfAsteriod(asteroids);
        for (Object re: output)
            System.out.print(re+" ");
    }

    private static Object[] stateOfAsteriod(int[] asteroids) {

        List<Integer> result =  new LinkedList<>();
        Stack<Integer> positiveNumbers = new Stack<>();

        for(int asteroid: asteroids){
            //

        }
       return result.toArray();
    }


}
