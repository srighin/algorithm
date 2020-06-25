package leet;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        int [] cookiesSize = {1,2, 3};
        int [] greedFactor = {1, 1};


        int findContainChild = findContainedChild(cookiesSize, greedFactor);
        System.out.println(findContainChild);
    }

    private static int findContainedChild(int[] cookiesSize, int[] greedFactor) {

        int containedFactor = 0;
        Arrays.sort(cookiesSize);
        Arrays.sort(greedFactor);

        int i = cookiesSize.length - 1;
        int j = greedFactor.length - 1;

        while(i >= 0 && j >= 0){
            if(cookiesSize[i] >= greedFactor[j]){
                containedFactor++;
                i--;
                j--;
            } else {
                j--;
            }
        }

        return containedFactor;
    }
}
