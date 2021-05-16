package array;

public class EquilibriumPoint {


    public static void main(String[] args) {
        int [] array = {-7, 1, 5, 2, -4, 3, 0};
        int index = findEquilibriumPoint(array);
        System.out.println("Equilibrium point:: "+index);
    }

    private static int findEquilibriumPoint(int[] array) {
        if(array== null || array.length == 0){
            return -1;
        }
        int sum = 0;
        for (int num: array){
            sum+=num;
        }
        int index;
        int temp = 0;
        for (index=0; index< array.length; index++){
            sum = sum-array[index];
            if(temp == sum){
                return index;
            }
            temp = temp + array[index];
        }
        return -1;
    }
}
