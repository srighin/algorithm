package leet;

public class HammingDistance {

    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        int hammingDistance = calculateHammingDistance(x, y);
        System.out.println(hammingDistance);
    }

    private static int calculateHammingDistance(int x, int y) {
        int result = 0;

        while(x > 0 || y > 0){
            result += (x%2) ^ (y%2);
            x /=2;
            y /=2;
        }
        return result;
    }
}
