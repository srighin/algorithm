package leet;

public class HasCycle {
    public static void main(String[] args) {
        int [] array = {2, 3, 1, -4, -4, 2};
        System.out.println(hasSingleCycle(array));
    }

    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.
        int noOfElementVisited = 0;
        int currentIndex = 0;
        while (noOfElementVisited < array.length){
            if(noOfElementVisited> 0 && array[currentIndex] == 0) return false;

            noOfElementVisited ++;
            currentIndex = getNextIndex(currentIndex, array);
        }
        return currentIndex==0;
    }

    private static int getNextIndex(int currentIndex, int [] array){
        int jump = array[currentIndex];
        int nextIndex = (currentIndex + jump) % array.length;
        return nextIndex> 0 ? nextIndex : nextIndex + array.length;
    }
}
