package leet;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        int [] numbers = {7, 1, 5, 3, 6, 4};
        int profit = 0;

        for(int i=0; i< numbers.length-1; i++){
            if(numbers[i+1] > numbers[i]){
                profit += numbers[i+1] - numbers[i];
            }
        }

        System.out.println(profit);
    }
}
