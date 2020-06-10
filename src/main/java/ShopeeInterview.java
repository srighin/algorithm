
class ShopeeInterview {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 6};
        int target = 5;
        System.out.println(seachElement(numbers, target, 0, numbers.length-1));

    }

    public static boolean seachElement(int [] numbers, int target, int startIndex, int endIndex){

        if ((endIndex - startIndex) < 0){
            return false;
        }
        int mid  = startIndex + (endIndex - startIndex)/2;
        if (numbers[mid] == target){
            return true;
        } else if (numbers[mid] > target) {
            return seachElement(numbers, target, startIndex, mid-1);
        } else {
            return seachElement(numbers, target, mid+1, endIndex);
        }
    }
}

