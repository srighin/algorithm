package leet;

public class MountainProblem {

    public static void main(String[] args) {
        int [] mountainArray = {1, 2, 3, 2, 1};
        System.out.println(isArrayMountain(mountainArray));
    }

    private static boolean isArrayMountain(int[] mountainArray) {
        int i = 0;

        while(i < mountainArray.length && i + 1<mountainArray.length && (mountainArray[i] < mountainArray[i+1])){
            i++;
        }

        if(i==0 || (i+1 >= mountainArray.length)){
            return false;
        }

        while (i< mountainArray.length -1 && i + 1<mountainArray.length){
            if(mountainArray[i] <= mountainArray[i++ +1]){
                return false;
            }
        }

        return true;
    }
}
