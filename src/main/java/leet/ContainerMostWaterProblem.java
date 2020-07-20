package leet;

public class ContainerMostWaterProblem {

    public static void main(String[] args) {
        int [] input = {1,8,6,2,5,4,8,3,7};
        int result = findContainerMostWater(input);
        System.out.println(result);
    }

    private static int findContainerMostWater(int[] height) {

        if (height == null || height.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;

        int start = 0;
        int end = height.length - 1;

        while(start < end){
            int h = Math.min(height[start], height[end]);
            max = Math.max(max, h*(end - start));
            if(height[start] < height[end]){
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
