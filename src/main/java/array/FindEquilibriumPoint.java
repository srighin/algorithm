package array;

public class FindEquilibriumPoint {
    public static void main(String[] args) {
        int []  numbers= {1, 6, 7, 0, 7};
        int sum = 0;
        for(int num: numbers){
            sum+=num;
        }
        int index = 0;
        int sumTillNow = 0;
        for(int num: numbers){
            sum -= num;
            if(sum == sumTillNow){
                System.out.println(index);
            }
            sumTillNow+=num;
            index++;
        }
    }
}
