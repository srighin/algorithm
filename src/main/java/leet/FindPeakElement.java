package leet;

public class FindPeakElement {

    public static void main(String[] args) {
        //int [] numbers = {1, 2, 3, 1};
        int [] numbers = {1, 2, 1, 3, 5, 6, 4};
        int index = findPeakElement(numbers);
        System.out.println(numbers[index]);
    }

    private static int findPeakElement(int[] numbers) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while(startIndex < endIndex){
            int mid = startIndex + (endIndex-startIndex)/2;

            if(numbers[mid] < numbers[mid+1]){
                startIndex = mid+1;
            } else {
                endIndex = mid;
            }
        }
        return startIndex;
    }
}
