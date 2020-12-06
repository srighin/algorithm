package leet;

public class FindRightMostSetBit {

    public static void main(String[] args) {
        int num = 8;
        int setBit = findRightMostSetBit(num);
        System.out.println(setBit);
    }

    private static int findRightMostSetBit(int num) {
        if(num == 0){
            return 0;
        }
        int rightMostBit = 0;

        while(num > 0){
            rightMostBit++;
            num /=2;
        }
        return rightMostBit;
    }
}
