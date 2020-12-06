package leet;

import java.util.stream.IntStream;

public class MaxRewardsProblem {

    public static void main(String[] args) {
        int [] scores = {8, 4, 2, 1, 3, 6, 7, 9, 5};
        System.out.println(minRewards(scores));
    }

    public static int minRewards(int[] scores) {
        // creating a rewards arrays and innitializing its value to 1
        int [] rewards = new int[scores.length];
        for(int i=0; i< scores.length; i++){
            rewards[i] = 1;
        }

        int index = 1;
        while(index < scores.length){
            if(scores[index-1] < scores[index]){
                rewards[index] = Math.max(rewards[index -1] +1, rewards[index]);
            }
            index++;
        }

        index = scores.length - 2;
        while(index >= 0){
            if(scores[index] > scores[index +1 ]){
                rewards[index] = Math.max(rewards[index+1] +1, rewards[index]);
            }
            index--;
        }


        return IntStream.of(rewards).sum();
    }


}
