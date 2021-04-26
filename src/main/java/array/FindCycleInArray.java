package array;

public class FindCycleInArray {
    public static void main(String[] args) {
        int[] array = {2, -1, 1, 2, -1};
        boolean isCycleExist = checkCycleExist(array);
        System.out.println(isCycleExist);
    }

    private static boolean checkCycleExist(int[] array) {
        if(array == null || array.length == 1){
            return false;
        }

        for (int index = 0; index < array.length; index++){
            boolean currentDirection = array[index] > 0;
            int slow = index;
            int fast= index;
            while(true){

                slow = getNextPointer(array, slow, currentDirection);
                if(slow == -1){
                    break;
                }

                fast = getNextPointer(array, fast, currentDirection);
                if(fast == -1){
                    break;
                }

                fast = getNextPointer(array, fast, currentDirection);
                if(fast == -1){
                    break;
                }

                if(slow == fast){
                    System.out.println("Cycle Exist");
                    return true;
                }

            }
        }
        return  false;
    }

    private static int getNextPointer(int[] array, int index, boolean currentDirection) {
        boolean nextDirection = array[index] > 0;
        if(currentDirection != nextDirection){
            return -1;
        }
        int nextIndex = (index + array[index])% array.length;

        if(nextIndex <0){
            nextIndex = nextIndex+ array.length;
        }

        if(nextIndex == index){
            return -1;
        }

        return nextIndex;
    }
}
