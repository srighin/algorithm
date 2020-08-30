package leet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class KeysAndRoomProblem {

    public static void main(String[] args) {

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        visited.add(0);
        stack.add(0);
        while(!stack.isEmpty()){
            List<Integer> keys = rooms.get(stack.pop());
            for(int key : keys){
                if(!visited.contains(key)){
                    stack.add(key);
                    visited.add(key);
                }
            }
        }
        return visited.size() == rooms.size();

    }
}
