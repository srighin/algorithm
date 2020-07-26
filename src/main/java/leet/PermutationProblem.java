package leet;

import java.util.ArrayList;
import java.util.List;

public class PermutationProblem {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        List<List<Integer>> result = new ArrayList<>();
        //findPermutation(0, array, result);
        getPermutation(array, new ArrayList<>(), result);
        for (List<Integer> eachResult : result){
            for (int i : eachResult){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void getPermutation(List<Integer> array, List<Integer> permutation, List<List<Integer>> permutations){
        if(array.size() == 0 && permutation.size()> 0){
            permutations.add(permutation);
        } else {
            for(int i=0; i< array.size(); i++){
                List<Integer> newArray = new ArrayList<>(array);
                newArray.remove(i);
                List<Integer> currentPermutation = new ArrayList<>(permutation);
                currentPermutation.add(array.get(i));
                getPermutation(newArray, currentPermutation, permutations);
            }
        }
    }

    private static void findPermutation(int startingIndex, List<Integer> array, List<List<Integer>> resultList) {
        if(startingIndex == array.size() - 1){
            resultList.add(new ArrayList<>(array));
        }else {
            for (int j = startingIndex; j < array.size(); j++){
                swapValue(startingIndex, j, array);
                findPermutation(startingIndex+1, array, resultList);
                swapValue(startingIndex, j, array);
            }
        }
    }

    private static void swapValue(int startingIndex, int j, List<Integer> array) {
        int temp = array.get(startingIndex);
        array.set(startingIndex, array.get(j));
        array.set(j, temp);
    }
}
